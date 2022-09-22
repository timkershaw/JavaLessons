package com.lessons;

public class Expressions {

    public static void main(String[] args) {
        // expression = operands & operators
        // operands = values, variables, numbers, quantity
        // operators = + - * / %

        int friends = 10;

        //long way of writing it out
        friends = friends + 1;

        //short way to increment;
        int drinks = 15;
        drinks++;

        //with integer division, we truncate any decimal portion since we like to retain the decimal
        //25 was an int but need to change data type to a double
        double shoes = 25;
        shoes = (double) shoes /3;

        System.out.println(friends);
        System.out.println(drinks);
        System.out.println(shoes);
    }
}
