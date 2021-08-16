package com.springboot.exceptionhandling.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class CarControllerAdvice extends ResponseEntityExceptionHandler {
    @ExceptionHandler({ModelNotFoundException.class})
    public String modelNotFound(){
        return "Model not found";
    }
    @ExceptionHandler({IllegalArgumentException.class})
    public String iaException(){
        return "Wrong not found";
    }
}
