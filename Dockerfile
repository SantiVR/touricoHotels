FROM ubuntu:16.04

#
# Insatll tomcat https://www.digitalocean.com/community/tutorials/how-to-install-apache-tomcat-8-on-ubuntu-16-04
#

ENV TOMCAT_ADMIN_USER admin
ENV TOMCAT_ADMIN_PASSWORD admin

# Upgrade OS image
RUN apt-get update;apt-get upgrade -y

# Installing java 8 JDK
## Adding the repository
RUN apt-get -y install software-properties-common
RUN add-apt-repository ppa:webupd8team/java
RUN apt-get update
## Enabling silent install
RUN echo debconf shared/accepted-oracle-license-v1-1 select true | debconf-set-selections
RUN echo debconf shared/accepted-oracle-license-v1-1 seen true | debconf-set-selections
## Installing Oracle JDK 8
RUN apt-get -y install oracle-java8-installer
RUN update-java-alternatives -s java-8-oracle
RUN apt-get install -y oracle-java8-set-default

# Installing maven
RUN apt-get -y install maven

# Insalling tomcat https://www.linode.com/docs/websites/frameworks/apache-tomcat-on-ubuntu-16-04
#RUN apt-get -y install tomcat8 tomcat8-docs tomcat8-examples tomcat8-admin
## Set tomcat admin
#RUN ls -la /var/lib/tomcat8
#ENV TOMCAT_ADMIN_CONF="<role rolename="manager-gui"/><role rolename="admin-gui"/><user username="$TOMCAT_ADMIN_USER" password="$TOMCAT_ADMIN_PASSWORD" roles="manager-gui,admin-gui"/>";
#RUN C=$(echo $TOMCAT_ADMIN_CONF | sed 's/\//\\\//g');sed "/<\/Students>/ s/.*/${C}\n&/" /var/lib/tomcat8/conf/tomcat-users.xml

# Copying source folders
RUN mkdir -p /src/touricoHotels
ADD lib /src/touricoHotels/lib
ADD src /src/touricoHotels/src
ADD pom.xml /src/touricoHotels

# Compiling, packaging
WORKDIR /src/touricoHotels
RUN mvn clean; mvn clean package

# Deploying
#ENV CATALINA_HOME=/usr/share/tomcat8
#ENV CATALINA_BASE=/var/lib/tomcat8
#ENV JAVA_OPTS="-Xms1g -Xmx1g"
#RUN echo "Deploying to $CATALINA_BASE/webapps/";cp -r */target/*war $CATALINA_BASE/webapps/

# Copying starting tomcat script
ADD assets/run.sh /
RUN chmod a+x /run.sh;sync

CMD /run.sh
