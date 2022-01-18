package com.karinapinchuk.lesson5;

public class Lesson5 {
    public static void main(String[] args) {
        Hen hen1 = HenFactory.getHen();
        System.out.println(hen1.getCountOfEggsPerMonth() + " eggs per month");
        System.out.println(hen1.getDescription());
        Hen hen2 = HenFactory.getHen();
        System.out.println(hen2.getCountOfEggsPerMonth() + " eggs per month");
        System.out.println(hen2.getDescription());
        Hen hen3 = HenFactory.getHen();
        System.out.println(hen3.getCountOfEggsPerMonth() + " eggs per month");
        System.out.println(hen3.getDescription());
        Hen hen4 = HenFactory.getHen();
        System.out.println(hen4.getCountOfEggsPerMonth() + " eggs per month");
        System.out.println(hen4.getDescription());
    }
}
