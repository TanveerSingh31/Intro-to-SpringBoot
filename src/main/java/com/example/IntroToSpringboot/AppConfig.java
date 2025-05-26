package com.example.IntroToSpringboot;


import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Configuration class -> contain methods for bean creation of this class, with parameterized constructor
@Configuration
public class AppConfig {

    @Bean
    public Sample2 getSample2Bean() {
        return new Sample2(100);
    }


    // configuring Filters
    // configured filter1 in filter chain
    @Bean
    public FilterRegistrationBean<CustomFilter1> addFilter() {
        FilterRegistrationBean<CustomFilter1> filterRegistrationBean = new FilterRegistrationBean<>();
        filterRegistrationBean.setFilter(new CustomFilter1()); // adds filter to filter chain
        filterRegistrationBean.addUrlPatterns("/sample"); // only applicable to this api path
        filterRegistrationBean.setOrder(1); // sets order of this filter in filter chain
        return filterRegistrationBean;

    }

    @Bean
    public FilterRegistrationBean<CustomFilter2> addFilter2() {
        FilterRegistrationBean<CustomFilter2> filterRegistrationBean = new FilterRegistrationBean<>();
        filterRegistrationBean.setFilter(new CustomFilter2()); // adds filter to filter chain
        filterRegistrationBean.addUrlPatterns("/*");
        filterRegistrationBean.setOrder(2);
        return filterRegistrationBean;
    }

}

