package com.springboot.exceptionhandling.exception;


public class ModelNotFoundException extends RuntimeException{

    public ModelNotFoundException(String param) {
        super(param);
    }
}
