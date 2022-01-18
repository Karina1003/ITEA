package com.karinapinchuk.lesson10;

public class LoginInfo {
    public static boolean enterInfo(String login, String password, String confirmPassword) throws WrongLoginException,
                                                                                                  WrongPasswordException{
        boolean loginOnlyLatinAlphabet = login.matches("^[a-zA-Z0-9_]+$");
        boolean pass1OnlyLatinAlphabet = password.matches("^[a-zA-Z0-9_]+$");
        if (login.length() == 0 || login.length() >= 20 || !loginOnlyLatinAlphabet) {
            throw new WrongLoginException();
        }
        if (password.length() == 0 || password.length() >= 20 || !pass1OnlyLatinAlphabet) {
            throw new WrongPasswordException();
        }
        if (!password.equals(confirmPassword)) {
            System.out.println("Passwords don't match");
            return false;
        }
        return true;
    }
}
