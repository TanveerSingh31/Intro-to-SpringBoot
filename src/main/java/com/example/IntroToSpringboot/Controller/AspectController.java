package com.example.IntroToSpringboot.Controller;

import com.example.IntroToSpringboot.AspectSample;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AspectController {

    @Autowired
    AspectSample aspectSampleObj;


    @GetMapping("/api/aspect-test")
    public String aspectTest(){
        aspectSampleObj.method1();
        aspectSampleObj.method2();
        aspectSampleObj.method3();
        return "sample-test";
    }

}
