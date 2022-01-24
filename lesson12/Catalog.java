package com.karinapinchuk.lesson12;

import java.util.Comparator;
import java.util.List;

public class Catalog {
    private String name;
    private double price;
    private int rating;

    public Catalog(String name, double price, int rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public static void sortByPrice (List<Catalog> list) {
        list.sort(Comparator.comparing(Catalog::getPrice));
    }

    public static void sortByName (List<Catalog> list) {
        list.sort(Comparator.comparing(Catalog::getName));
    }

    public static void sortByRating (List<Catalog> list) {
        list.sort(Comparator.comparing(Catalog::getRating));
    }

    @Override
    public String toString() {
        return name;
    }
}
