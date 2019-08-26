package com.fastrackit;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String args[]){
        Adopter firstAdopter = new Adopter();
        firstAdopter.setName("John");

        Food firstFood = new Food();
        firstFood.setFoodName("Purina");

        Animal firstAnimal = new Animal();
        firstAnimal.setName("Tom");


        System.out.println(firstAdopter.name + " " +"just give some" + " " + firstFood.foodName + " " + "to" + " " + firstAnimal.name);



//        Vt vet = new Vet("Michael", 41,"orthopedics");
//        Recreational recreational = new Recreational("run");
    }



}
