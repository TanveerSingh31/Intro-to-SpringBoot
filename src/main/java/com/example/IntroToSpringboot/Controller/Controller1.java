package com.example.IntroToSpringboot.Controller;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@Profile("prod")
@RestController
public class Controller1 {

    @Autowired
    SingletonController singletonControllerObj;

    @Autowired
    PrototypeController prototypeControllerObj;

    @Lazy
    @Autowired
    RequestScopeController requestScopeControllerObj = null;

    @Value("${env_data}")
    Object obj;

    // ConditionalOnProperty -> conditionally creates beans
    @Autowired(required = false)
    ConditionalOnPropertyClass conditionalOnPropertyClassObj;



    public Controller1() {
        System.out.println("Controller-1 object initialized");
    }


    @GetMapping(path="/api/requestScopeController")
    public int requestScopeControllerInitialization(){
        return requestScopeControllerObj.hashCode();
    }


    @PostConstruct
    public void afterBeanCreation(){
        System.out.println("singleton obj hash = " + singletonControllerObj.hashCode());
        System.out.println("prototype obj hash = " + prototypeControllerObj.hashCode());
        System.out.println("bean of ConditionalOnProperty = " + conditionalOnPropertyClassObj);
        System.out.println("env property = " + obj);

    }
}

