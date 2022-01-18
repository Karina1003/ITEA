package com.karinapinchuk.lesson4;

import com.karinapinchuk.lesson4.Gender;

import java.util.Objects;

public class Person {

    private String name;
    private String surname;
    private int age;
    private Gender gender;

    public Person() {
    }

    public Person(String name, String surname, int age, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Gender getGender() {
    return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                "surname='" + surname + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}

