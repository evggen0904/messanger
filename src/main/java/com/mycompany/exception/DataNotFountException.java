package com.mycompany.exception;


public class DataNotFountException extends RuntimeException{

    public DataNotFountException() {
    }

    public DataNotFountException(String message) {
        super(message);
    }
}
