package com.karinapinchuk.lesson4;

import java.util.NoSuchElementException;

public class Lesson4 {
    public static void main(String[] args) {
        Group group1 = new Group ("Third Year 2021");
        Student student1 = new Student("Jack", "Daniels", 20, Gender.Man, "116-A", "116-A-23",3.5,2021);
        Student student2 = new Student("Ann", "Daniels", 19, Gender.Woman, "116-A", "116-A-35",4.7,2021);
        Student student3 = new Student ("Jane", "Adams", 20, Gender.Woman, "116-A", "116-A-08",4.3,2021);
        Student student4 = new Student ("Dave", "Adams", 20, Gender.Man, "116-A", "116-A-09",2.7,2021);
        Student student5 = new Student ("Jane", "Berkly", 20, Gender.Woman, "116-A", "116-A-01",5.0,2021);
        Student student6 = new Student ("Robert", "Jacks", 20, Gender.Man, "116-A", "116-A-02",4.6,2021);
        Student student7 = new Student ("Bob", "Dans", 19, Gender.Man, "116-A", "116-A-03",3.2,2021);
        Student student8 = new Student ("Nike", "Bord", 20, Gender.Woman, "116-A", "116-A-0",2.9,2021);
        Student student9 = new Student ("Viktor", "White", 20, Gender.Man, "116-A", "116-A-058",3.8,2021);
        Student student10 = new Student ("Sam", "Brown", 20, Gender.Man, "116-A", "116-A-0845",4.9,2021);

        group1.addStudent(student1);
        group1.addStudent(student2);
        group1.addStudent(student3);
        group1.addStudent(student4);
        group1.addStudent(student5);
        group1.addStudent(student6);
        group1.addStudent(student7);
        group1.addStudent(student8);
        group1.addStudent(student9);
        group1.addStudent(student10);
        System.out.println(group1.toString());

        group1.deleteStudent("116-A-09");
        group1.deleteStudent("116-A-0845");
        group1.deleteStudent("116-A-345");
        System.out.println(group1.toString());

        try {
            System.out.println(group1.searchStudent("DANIELS"));
           // group1.searchStudent("Roberts");
        } catch (NoSuchElementException e){
            e.printStackTrace();
        }
    }
}
