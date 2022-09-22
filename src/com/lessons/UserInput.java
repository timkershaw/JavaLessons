package com.lessons;

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        // Creates a prompt that will ask someone for their name
        System.out.println("What is your name? ");

        //Assign user input to a string variable
        String name = scanner.nextLine();

        //Asking someone for their age
        System.out.println("How old are you? ");

        //Declare an interger for age
        int age = scanner.nextInt();

        //important to reset the line break
        scanner.nextLine();
        //Asking for favorite food
        System.out.println("What is your favorite food?");

        //Creating a string variable called food
        String food = scanner.nextLine();

        //Display name within a message
        System.out.println("Hello "+ name);

        System.out.println("You are " +age+" years old");
        System.out.println("You like " +food);
    }
}
