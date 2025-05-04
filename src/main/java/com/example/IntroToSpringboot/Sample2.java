package com.example.IntroToSpringboot;

import org.springframework.stereotype.Component;

// class with Parameterized constructor, Bean cannot be automatically created
// We need to provide a configuration class, which will contain methods for bean creation of this class


public class Sample2 {
    public int data;

    public Sample2(){
        this.data = 0;
    }

    public Sample2(int data) {
        this.data = data;
    }
}

