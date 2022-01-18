package com.karinapinchuk.lesson7;

public class UserInfo {
    private String userName;
    private String password;

    public UserInfo() {
    }

    public UserInfo(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void login() {
        String defaultUser = "ThisUser";
        String defaultPassword = "123qwe456ASD";
        if (this.userName == null || this.password == null) {
            System.out.println("Please, initialize username and password");
        }
        if (defaultUser.equals(this.userName) && defaultPassword.equals(this.password)) {
            System.out.println("The username and password is correct");
        } else {
            System.out.println("The username and password is incorrect");
        }
    }
}
