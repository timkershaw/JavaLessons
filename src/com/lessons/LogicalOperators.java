package com.lessons;

import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        /*
        * logical operators = used to connect two or more expressions
        *
        *  && = (AND) both conditions must be true
        *  || = (OR) either condition must be true
        *   ! = (NOT) reverses boolean value of condition*/

        //checking to see if our temp is within a certain range
        int temp = 25;

        if(temp>30) {
            System.out.println("It is hot outside");
        } else if(temp>= 20 && temp<=30) { //both conditions must be true
            System.out.println("It is warm outside");
        } else {
            System.out.println("It is cold outside");
        }

        //for the OR statement
        Scanner scanner = new Scanner(System.in);

        //will ask the user if they want to quite the game
        System.out.println("You are playing a game! Press q or Q to quit");
        String response = scanner.next();

        //checking to see if our response is a q or Q
        if(response.equals("q") || response.equals("Q")) {
            System.out.println("You quit the game");
        } else {
            System.out.println("You are still playing the game *pew pew*");
        }
    }
}
