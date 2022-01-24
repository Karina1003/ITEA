package com.karinapinchuk.lesson12;

import com.karinapinchuk.lesson4.Gender;
import com.karinapinchuk.lesson4.Person;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {

    private String group = null;
    private String ID = null;
    double rating = 0.0;
    int year = 0;

    public Student() {
    }

    public Student(String name, String surname, int age, Gender gender, String group, String ID, double rating, int year) {
        super(name, surname, age, gender);
        this.group = group;
        this.ID = ID;
        this.rating = rating;
        this.year = year;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public static void nextYear (List<Student> students) {
        List <Student> newList = new ArrayList<>();
        for (Student st:students) {
            if (st.getRating() < 3) {
                newList.add(st);
            }
        }
        students.removeAll(newList);
    }

    public static void printStudents (List<Student> students, String group) {
        for (Student st:students) {
            System.out.println(st);
        }
    }

    @Override
    public String toString() {
        return "Student " + super.getName() + " " + getSurname() + '\'' +
                "group " + group + '\'' +
                "ID='" + ID + '\'' +
                "rating=" + rating;
    }
}
