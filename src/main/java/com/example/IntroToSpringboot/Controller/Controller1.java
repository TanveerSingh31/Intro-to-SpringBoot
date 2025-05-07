package com.example.IntroToSpringboot.Controller;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
public class Controller1 {

    @Autowired
    SingletonController singletonControllerObj;

    public Controller1() {
        System.out.println("Controller-1 object initialized");
    }


    @PostConstruct
    public void afterBeanCreation(){
        System.out.println(singletonControllerObj.hashCode());
    }
}

