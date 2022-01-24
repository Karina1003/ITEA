package com.karinapinchuk.lesson12;

public class Dog extends Pet{

    public Dog(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Dog " + super.getName();
    }
}
