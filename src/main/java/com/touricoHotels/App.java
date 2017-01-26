package com.touricoHotels;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;


@SpringBootApplication
@Configuration
@ComponentScan(basePackages={"com.touricoHotels"})
@ContextConfiguration(locations = { "classpath:Beans.xml" }, classes = { ApplicationProperties.class })
@EnableAutoConfiguration(exclude = {HibernateJpaAutoConfiguration.class})
public class App 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(App.class, args);
    }
    
}
