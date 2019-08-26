package com.fastrackit;

public class Animal extends Person{
    private int healthLevel;
    private int hungryLevel;
    private int moodLevel;
    private String favoriteFood;
    private String favoriteActivity;

//Setters

public void setHealthLevel(int healthLevel){
    this.healthLevel = healthLevel;
}

public void setHungryLevel(int healthLevel){
    this.hungryLevel = healthLevel;
}

public void setMoodLevel(int moodLevel){
    this.moodLevel = moodLevel;
}

public void setFavoriteFood(String favoriteFood){
    this.favoriteFood = favoriteFood;
}

public void setFavoriteActivity(String favoriteActivity){
    favoriteActivity = favoriteActivity;
}

 //Constructor

public Animal (String name, int age, int healtLevel, int hungryLevel, int moodLevel, String favoriteFood, String favoriteActivity) {
    this.name = name;
    this.age = age;
    healthLevel = healtLevel;
    this.hungryLevel = hungryLevel;
    this.moodLevel = moodLevel;
    this.favoriteFood = favoriteFood;
    this.favoriteActivity = favoriteActivity;
}
}