package com.lessons;
//Part of the toStringMethod lesson

public class Car {

    String make = "Ford";
    String model = "Mustang";
    String color = "red";
    int year = 2021;

    //override the toString method
    public String toString() {
        String myString = make +"\n"+model+"\n"+color+"\n"+year;
        return myString;
    }
}
