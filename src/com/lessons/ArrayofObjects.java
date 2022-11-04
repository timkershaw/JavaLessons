package com.lessons;
//Part of the Food class

public class ArrayofObjects {

    public static void main(String[] args) {

        Food[] refrigerator = new Food[3];

        //creating 3 food objects
        Food food1 = new Food("pizza");
        Food food2 = new Food("hamburger");
        Food food3 = new Food("hotdog");

        //store the objects in the refrigerator array
        refrigerator[0] = food1;
        refrigerator[1] = food2;
        refrigerator[2] = food3;

        //printing out all 3 elements
        System.out.println(refrigerator[0].name);
        System.out.println(refrigerator[1].name);
        System.out.println(refrigerator[2].name);
    }
}
