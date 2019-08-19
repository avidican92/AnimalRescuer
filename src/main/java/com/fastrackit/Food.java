package com.fastrackit;

public class Food {
    String foodName;
    double price;
    double quantity;
    java.util.Date expirationDate;
    int stock;

    //Constructor
    public Food(String foodName, double price, double quantity, int expirationDate, int stock){
        this.foodName = foodName;
        this.price = price;
        this.quantity = quantity;
        this.expirationDate = expirationDate;
        this.stock = stock;
    }
}
