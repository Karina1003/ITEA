package com.karinapinchuk.lesson12;

public class Cat extends Pet{

    public Cat(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Cat " + super.getName();
    }
}
