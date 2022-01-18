package com.karinapinchuk.lesson7;

public class Book {
    private String title;
    private String author;
    private String publisher;
    private double price;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Book(String title, String author, String publisher, double price) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        if (price <= 10) {
            System.out.println("The price must be > 10");
            this.price = 10;
        } else {
            this.price = price;
        }
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 10) {
            System.out.println("The price must be > 10");
            this.price = 10;
        } else {
            this.price = price;
        }
    }

    @Override
    public String toString() {
        return "Book's title is " + title + '\n' +
                "author is " + author + '\n' +
                "publisher is " + publisher + '\n' +
                "price equals " + price;
    }
}
