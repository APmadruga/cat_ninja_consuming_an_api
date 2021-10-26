package com.upgradehub.provider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

//implementing to the Spring boot context a RestTemplate
@Configuration// ?
public class HttpClientConfig {
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
