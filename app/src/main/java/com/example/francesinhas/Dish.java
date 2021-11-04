package com.example.francesinhas;

public class Dish {

    // State
    String title;
    String description;
    int price;

    // Behavior - Metodos


    // Constructor
    Dish(String title, String description, int price){

        this.title = title;
        this.description= description;
        this.price = price;


    }

    @Override
    public String toString() {
        return title + "     ---->     " + description;
    }
}
