package com.example.IntroToSpringboot.Controller;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller2 {

    @Autowired
    SingletonController singletonControllerObj;

    @Autowired
    PrototypeController prototypeControllerObj;

    public Controller2() {
        System.out.println("Controller2 object initialized");
    }

    @PostConstruct
    public void afterBeanCreation(){
        System.out.println("singleton obj hash = " + singletonControllerObj.hashCode());
        System.out.println("prototype obj hash = " + prototypeControllerObj.hashCode());
    }
}