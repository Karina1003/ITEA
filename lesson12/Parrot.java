package com.karinapinchuk.lesson12;

public class Parrot extends Pet{

    public Parrot(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Parrot " + super.getName();
    }
}
