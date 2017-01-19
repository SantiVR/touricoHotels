package com.touricoHotels;

import org.apache.http.client.config.RequestConfig;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.web.client.RestTemplate;


/**
 * Hello world!
 *
 */
@SpringBootApplication
@Configuration
@ContextConfiguration(locations = { "classpath:beans.xml" }, classes = { ApplicationProperties.class })
public class App 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(App.class, args);
    }
    
    @Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return new RestTemplate(getClientHttpRequestFactory());
	}
    
    private static ClientHttpRequestFactory getClientHttpRequestFactory() {
		int timeout = 5000;
		RequestConfig config = RequestConfig.custom().setConnectTimeout(timeout).setConnectionRequestTimeout(timeout)
				.setSocketTimeout(timeout).build();
		CloseableHttpClient client = HttpClientBuilder.create().setDefaultRequestConfig(config).build();
		return new HttpComponentsClientHttpRequestFactory(client);
	}
}
