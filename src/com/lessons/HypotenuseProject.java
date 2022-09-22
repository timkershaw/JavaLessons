package com.lessons;

import java.util.Scanner;

//Project that finds the hypotenuse of a triangle
//ask the user for side x and side y
public class HypotenuseProject {

    public static void main(String[] args) {
        //declaring 3 variables
        double x;
        double y;
        double z;

        //A scanner to accept some user input
        Scanner scanner = new Scanner(System.in);

        //prompt for side x and y
        System.out.println("Enter side x: ");
        x = scanner.nextDouble();
        System.out.println("Enter side y: ");
        y = scanner.nextDouble();

        //formula for hypotenuse and assigned it to z variable
        z = Math.sqrt((x*x)+(y*y));

        System.out.println("The hypotenuse is : "+z);

        scanner.close();
    }
}
