package com.example.IntroToSpringboot.Controller;

import com.example.IntroToSpringboot.Sample2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DependencyInjection {



    // Different ways of Dependency Injection in spring

    // 1. Field level Injection
    @Autowired
    public final Sample2 sample2Obj = null;


    // 2. Setter Injection



    // 3. Constructor Injection



    public static void main(String [] args) {
        Sample2 obj2 = new Sample2();
        System.out.println(obj2.data);
    }


}
