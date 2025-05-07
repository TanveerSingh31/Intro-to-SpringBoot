package com.example.IntroToSpringboot.Controller;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
@Scope("prototype")
public class PrototypeController {

    public PrototypeController(){
        System.out.println("prototype controller object initialized");
    }


}
