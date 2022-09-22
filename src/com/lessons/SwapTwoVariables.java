package com.lessons;

public class SwapTwoVariables {

    public static void main(String[] args) {

        String x = "water";
        String y = "Kool-Aid";
        // temp is a temporary value to temporaraily stor one of these values
        String temp;

        temp = x;
        x=y;
        y=temp;

        System.out.println("x: "+x);
        System.out.println("y: "+y);
    }
}
