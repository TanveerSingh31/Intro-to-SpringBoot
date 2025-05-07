package com.example.IntroToSpringboot.Controller;


import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;


// If the given values match in application.properties , only then the bean of this class will get created !!

@Component
@ConditionalOnProperty(prefix="sample", value="data", havingValue ="true", matchIfMissing = false)
public class ConditionalOnPropertyClass {

    public ConditionalOnPropertyClass() {
        System.out.println("ConditionalOnPropertyClass object created !");
    }

}
