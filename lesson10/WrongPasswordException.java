package com.karinapinchuk.lesson10;

public class WrongPasswordException extends Exception {
    public WrongPasswordException() {
    }

    public WrongPasswordException(String message) {
        super(message);
    }

    public String getMessage(){
        return "Wrong password";
    }
}
