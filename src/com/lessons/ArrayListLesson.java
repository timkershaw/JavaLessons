package com.lessons;

import  java.util.ArrayList;
public class ArrayListLesson {
    public static void main(String[] args) {
        /*
        ArrayList = a resizable array.
        Elements can be added and removed after compilation phase
        store reference data types


         */

        //Steps to create an ArrayList that stores food
        ArrayList<String> food = new ArrayList<String>();

        food.add("pizza");
        food.add("hamburger");
        food.add("hotdog");

        for(int i=0; i<food.size(); i++) {
            System.out.println(food.get(i));
        }

        // food.set method can replace a value in the array
        //food.set(0, "sushi");  will replace pizza with sushi

        //the food.remove method removes a value
        //food.remove(2); will remove hotdog

        //the food.clear method clears all the values
        //food.clear(); will delete all elements
    }
}
