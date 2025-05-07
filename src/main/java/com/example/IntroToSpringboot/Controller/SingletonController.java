package com.example.IntroToSpringboot.Controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
@Scope("singleton") // -> 1 Bean created, and stored in IOC container
public class SingletonController {

    public SingletonController() {
        System.out.println("singleton controller object initialized");
    }


}
