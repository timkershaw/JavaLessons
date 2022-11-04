package com.lessons;

public class toStringMethod {
    public static void main(String[] args) {
        //toString() = special method that all objects inherit,
        //that returns a string that "textually represents" an object.
        //can be used both implicitly and explicitly

        //creating an instance of the car class
        Car car = new Car();

        System.out.println(car.toString());
        System.out.println();

        //only going to print the name of the car
        System.out.println(car);
    }
}
