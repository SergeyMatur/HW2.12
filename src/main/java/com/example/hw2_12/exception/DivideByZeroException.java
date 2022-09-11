package com.example.hw2_12.exception;

public class DivideByZeroException extends IllegalArgumentException {
    public DivideByZeroException() {
    }

    public DivideByZeroException(String s) {
        super(s);
    }

    public DivideByZeroException(String message, Throwable cause) {
        super(message, cause);
    }

    public DivideByZeroException(Throwable cause) {
        super(cause);
    }
}
