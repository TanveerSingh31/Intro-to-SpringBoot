package com.example.IntroToSpringboot;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Component
@Aspect
public class AspectClass {

    // Will target only method-1 of the AspectSample
    @Before("execution(public void com.example.IntroToSpringboot.AspectSample.method1())")
    public void beforeMethod1() {
        System.out.println("-----------Advice invoked before method 1-----------");
    }


    // Will target All methods of AspectSample class
    @Before("within(com.example.IntroToSpringboot.AspectSample)")
    public void beforeAllMethods() {
        System.out.println("-----------Advice invoked before all methods -----------");
    }


}
