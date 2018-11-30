package com.company.lesson17;

public class WrongLoginException extends Exception {

    public WrongLoginException(String message) {
        super(message);
    }

    public WrongLoginException() {
    }
}
