package com.lessons;

public class MathClass {

    public static void main(String[] args) {

        //finding the MAX using the MAX method
        double x = 3.14;
        double y = -10;
        //double s = 10;

        //assigned to new variable
        double z = Math.max(x, y);

        //finding the lesser of the two numbers
        double i = Math.min(x, y);

        //the absolute method
        double b = Math.abs(y);

        //the square root method
        double s = Math.sqrt(b);

        //the round method
        double r = Math.round(x);

        //the ceil method will always round up
        double c = Math.ceil(x);

        //the floor method will always round down
        double f = Math.floor(x);

        System.out.println(z);
        System.out.println(i);
        System.out.println(b);
        System.out.println(s);
        System.out.println(r);
        System.out.println(c);
        System.out.println(f);
    }
}
