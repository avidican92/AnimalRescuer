package com.fastrackit;

public class Food {
    private String foodName;
    private double price;
    private double quantity;
    private int expirationDate;
    private int stock;


    //Setters


    public void setFoodName(String foodName){
        this.foodName = foodName;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setQuantity(double quantity){
        this.quantity = quantity;
    }

    public void setExpirationDate(int expirationDate){
        this.expirationDate = expirationDate;
    }

    public void setStock(int stock){
        this.stock = stock;
    }


    //Constructor
//    public Food(String foodName, double price, double quantity, int expirationDate, int stock){
//        this.foodName = foodName;
//        this.price = price;
//        this.quantity = quantity;
//        this.expirationDate = expirationDate;
//        this.stock = stock;
//    }
}
