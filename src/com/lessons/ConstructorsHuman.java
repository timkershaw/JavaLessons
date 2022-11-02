package com.lessons;

public class ConstructorsHuman {

    String name;
    int age;
    double weight;

    //to setup a constructor within a class
    //setting up some parameters: name, age, and weight
    ConstructorsHuman(String name, int age, double weight){

        //"this" replaces the object name (human)
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    //in order to access the object with different attributes within its own class, we have to use
    //this keyword

    // creating 2 methods: eat and drink
    void eat() {
        System.out.println(this.name+ " is eating");
    }
    void drink() {
        System.out.println(this.name+ " is drinking *burp*");
    }
}
