package com.lessons;

public class MethodReturnTypes {
    public static void main(String[] args) {
        int x = 3;
        int y = 4;

        //the add argument, this is called the local variable since it's inside the main method
        int z = add(x, y);

        System.out.println(z);
    }
    //list the data type instead of void
    static int add(int x, int y) {
        //creating a new variable of adding x and y
       int z = x + y;
        //need to list a return statement
        return z;
    }
}
