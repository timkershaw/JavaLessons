package com.lessons;

import java.util.ArrayList;

public class TwoDArrayList {
    public static void main(String[] args) {
        //2D ArrayList = a dynamic list of lists
        //You can change the size of these lists during runtime

        //Creating the actual 2D array list. Contains multiple list of things with need to buy.
        ArrayList<ArrayList<String>> groceyList = new ArrayList<>();

        //Going to create an array lists of bakery goods
        ArrayList<String> bakeryList = new ArrayList<>();
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");

        //Going to create an array lists of produce
        ArrayList<String> produceList = new ArrayList<>();
        produceList.add("tomatoes");
        produceList.add("zucchini");
        produceList.add("peppers");

        //Going to create an array lists of drinks
        ArrayList<String> drinksList = new ArrayList<>();
        drinksList.add("soda");
        drinksList.add("coffee");

        //the .get calls which index to print out
        System.out.println(bakeryList.get(0));

        System.out.println(drinksList);

        groceyList.add(bakeryList);
        groceyList.add(produceList);
        groceyList.add(drinksList);

        System.out.println(groceyList);

        //if we wanted the first list of the index
        System.out.println(groceyList.get(0));

        //if we want the first element of the first list
        System.out.println(groceyList.get(0).get(0));

        //if we wanted coffee
        System.out.println(groceyList.get(2).get(1));
    }
}
