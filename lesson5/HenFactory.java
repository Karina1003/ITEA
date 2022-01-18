package com.karinapinchuk.lesson5;

import java.util.Locale;
import java.util.Scanner;

public class HenFactory {
    public static Hen getHen(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the country");
        String country = scanner.nextLine();
        switch (country.toLowerCase(Locale.ROOT)) {
            case "ukraine" -> {
                System.out.println("One Ukrainian hen");
                return new UkrainianHen();
            }
            case "moldova" -> {
                System.out.println("One Moldovan hen");
                return new MoldovanHen();
            }
            case "poland" -> {
                System.out.println("One Polish hen");
                return new PolishHen();
            }
            case "belarus" -> {
                System.out.println("One Belarusian hen");
                return new BelarusianHen();
            }
            default -> {
                System.out.println("I couldn't find a hen from the country you entered, so take the Ukrainian one");
                return new UkrainianHen();
            }
        }

    }
}
