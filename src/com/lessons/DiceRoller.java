package com.lessons;
//Part of the Variable Scope lesson

import java.util.Random;

public class DiceRoller {
    /*
    for global:
    Random random;
    int number;

    DiceRoller(){
        random = new Random();
        roll();
     }

     void roll() {
        number = random.nextInt(6)+1;
        System.out.println(number);
     */

    //creating a constructor
    DiceRoller() {
        //creating an instance of a random class
        Random random = new Random();
        int number = 0;
        roll(random,number);

    }
    void roll(Random random,int number) {
        number = random.nextInt(6)+1;
        System.out.println(number);
    }
}
