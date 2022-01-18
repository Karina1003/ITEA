package com.karinapinchuk.lesson4;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + super.getName() + '\'' +
                "surname='" + getSurname() + '\'' +
                ", age=" + getAge() +
                ", gender='" + getGender() + '\'' +
                "group='" + group + '\'' +
                ", ID='" + ID + '\'' +
                ", rating=" + rating +
                ", year=" + year +
                '}';
    }
}
