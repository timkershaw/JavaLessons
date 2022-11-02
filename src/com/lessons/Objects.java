package com.lessons;

public class Objects {
    public static void main(String[] args) {
        //object = an instance of a class that may contain attributes and methods
        //examples: (phone, desk, computer, coffee cup)

        //construct the car object
        ObjectsCar myCar1 = new ObjectsCar();

        //adding a second car
        ObjectsCar myCar2 = new ObjectsCar();

        //print out the model of the car
        System.out.println(myCar1.model);

        //print out the make of the car
        System.out.println(myCar1.make);

        //call the drive method
        myCar1.drive();

        //call the brake method
        myCar1.brake();

        System.out.println();

        //print out the make of myCar2
        System.out.println(myCar2.make);
    }

    //to create a new class within the same file, make sure you do it outside the main method
    //Creating new java files makes it appear more organized
}
