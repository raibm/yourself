package com.love.yourself.custom;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.NoSuchElementException;

@ControllerAdvice
public class ExceptionHandlerAdvice {

    @ExceptionHandler({NoSuchElementException.class})
    public Object genericException(Object e) {
        return e;
    }
}