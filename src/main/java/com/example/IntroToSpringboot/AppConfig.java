package com.example.IntroToSpringboot;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Configuration class -> contain methods for bean creation of this class, with parameterized constructor
@Configuration
public class AppConfig {

    @Bean
    public Sample2 getSample2Bean() {
        return new Sample2(100);
    }

}

