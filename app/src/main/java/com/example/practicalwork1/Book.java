package com.example.practicalwork1;

public class Book {
    private String name;
    private int imageResource;

    public Book(String name, int imageResource) {
        this.name = name;
        this.imageResource = imageResource;
    }

    public String getName() {
        return name;
    }

    public int getImageResource() {
        return imageResource;
    }
}

