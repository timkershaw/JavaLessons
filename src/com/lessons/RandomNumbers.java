package com.lessons;

import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        //instance of the random class
        Random random = new Random();

        //to limit the size of the random number, we pass in a value to the next int method
        //by placing 6 in the parentheses for 6 sided dice and add 1 so zero is not generated
        int x = random.nextInt(6)+1;

        System.out.println(x);
    }
}
