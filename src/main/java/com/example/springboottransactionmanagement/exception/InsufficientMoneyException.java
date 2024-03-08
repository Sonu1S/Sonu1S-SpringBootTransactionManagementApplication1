package com.example.springboottransactionmanagement.exception;

public class InsufficientMoneyException extends RuntimeException {

    public InsufficientMoneyException(String message){
        super(message);
    }
}
