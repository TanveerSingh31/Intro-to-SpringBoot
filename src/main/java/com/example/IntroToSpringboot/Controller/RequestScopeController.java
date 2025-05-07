package com.example.IntroToSpringboot.Controller;


import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RestController;

@Scope("request")
@RestController
public class RequestScopeController {

    public RequestScopeController() {
        System.out.println("RequestScopeController object initialization");
    }


}
