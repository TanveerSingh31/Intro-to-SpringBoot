package com.example.IntroToSpringboot.Controller;

import org.springframework.http.HttpStatus;

public class CustomException extends RuntimeException {

    public HttpStatus status;
    public String message;

    public CustomException(HttpStatus s , String m) {
        status = s;
        message = m;
    }

}


