package com.lessons;

public class FinalKeyword {
    public static void main(String[] args) {

        //some put the variable in all caps to signify that it is final
        final double PI = 3.14159;
        //can't update pi since it is final
        //pi = 4;

        System.out.println(PI);
    }
}
