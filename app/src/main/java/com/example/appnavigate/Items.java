package com.example.appnavigate;

public class Items {
    private int id;
    private String title;
    private double rating;
    private double price;
    private String image;

    public Items(int id, String title,  double rating, double price, String image){
        this.id = id;
        this.title = title;
        this.rating = rating;
        this.price = price;
        this.image = image;
    }


    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public double getRating() {
        return rating;
    }

    public double getPrice() {
        return price;
    }

    public String getImage() {
        return image;
    }
}
