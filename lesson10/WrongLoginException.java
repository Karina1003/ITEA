package com.karinapinchuk.lesson10;

public class WrongLoginException extends Exception{
    public WrongLoginException() {
    }

    public WrongLoginException(String message) {
        super(message);
    }

    public String getMessage(){
        return "Wrong login";
    }
}
