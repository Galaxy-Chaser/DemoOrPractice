package org.example.jwt_demo.globalException;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class Handler {

    @ExceptionHandler
    public String exceptionHandler(Exception e) {
        e.printStackTrace();
        return e.getMessage();
    }
}
