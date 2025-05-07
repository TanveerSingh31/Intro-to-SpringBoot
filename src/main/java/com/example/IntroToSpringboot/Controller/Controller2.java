package com.example.IntroToSpringboot.Controller;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
public class Controller2 {

    @Autowired
    SingletonController singletonControllerObj;

    public Controller2() {
        System.out.println("Controller2 object initialized");
    }

    @PostConstruct
    public void afterBeanCreation(){
        System.out.println(singletonControllerObj.hashCode());
    }
}