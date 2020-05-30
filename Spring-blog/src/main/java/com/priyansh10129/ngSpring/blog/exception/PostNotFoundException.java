package com.priyansh10129.ngSpring.blog.exception;


public class PostNotFoundException extends RuntimeException {
    public PostNotFoundException(String message) {
        super(message);
    }
}
