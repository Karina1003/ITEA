package com.karinapinchuk.lesson7;

public class Lesson7 {
    public static void main(String[] args) {
        Book bookDetectiveNovel = new Book("The ABC Murder", "Agatha Christie");
        bookDetectiveNovel.setPublisher("Trident Media Group");
        bookDetectiveNovel.setPrice(700);
        System.out.println(bookDetectiveNovel.toString());

        UserInfo user1 = new UserInfo();
        user1.login();
        user1.setUserName("ASDW");
        user1.setPassword("123sd");
        user1.login();
        UserInfo user2= new UserInfo("ThisUser", "123qwe456ASD");
        user2.login();
    }
}
