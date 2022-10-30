package com.lessons;

import java.util.ArrayList;

public class ForEachLoop {
    public static void main(String[] args) {
        /*
        for-each = traversing technique to iterate through the elements in an array/collection
        less steps, more readable
        less flexible
         */

        //Creating an array of animals
        ArrayList<String> animals = new ArrayList<>();

        animals.add("cat");
        animals.add("dog");
        animals.add("rat");
        animals.add("bird");

        //the for loop statement
        for (String i : animals) {
            //printing animals array assigned as the i variable
            System.out.println(i);

        }
    }
}
