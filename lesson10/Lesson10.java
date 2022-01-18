package com.karinapinchuk.lesson10;

public class Lesson10 {
    public static void main(String[] args) {
        try {
            System.out.println(LoginInfo.enterInfo("user21", "pass_123", "pass_123"));
        } catch (WrongLoginException e) {
            e.printStackTrace();
        } catch (WrongPasswordException e) {
            e.printStackTrace();
        }
    }
}
