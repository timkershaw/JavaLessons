package com.lessons;

public class Constructors {
    public static void main(String[] args) {
        //constructor = special method that is called when an object is instantiated (created)

        //need to pass in some matching arguments within the constructor
        ConstructorsHuman human1 = new ConstructorsHuman("Rick",65,70);

        //creating human2 object
        ConstructorsHuman human2 = new ConstructorsHuman("Morty",25,50);

        System.out.println(human1.name);

        System.out.println(human2.name);

        //calling the name in human2 object with the eat method
        human2.eat();

        //calling the name in human1 object with the drink method
        human1.drink();
    }
}
