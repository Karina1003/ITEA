package com.karinapinchuk.lesson5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BelarusianHen extends Hen{
    int eggs;
    @Override
    public int getCountOfEggsPerMonth() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How old is this hen?");
        double age = 5.0;
        try {
            age = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("This is not a number");
        }
        if (age < 1.0) {
            eggs = 20;
        } else if (age < 3.0) {
            eggs = 15;
        } else {
            eggs = 10;
        }
        return eggs;
    }
    @Override
    public String getDescription() {
        return super.getDescription()+" My country is Belarus. I lay "+eggs+" a month.";
    }
}
