package com.lessons;

public class StringMethods {
    public static void main(String[] args) {
        /*
        String = a reference data type that can store one or more characters
        reference data types have access to useful methods
         */

        String name = "Tim is 24 again";
        String nameOnly = "      Tim      ";

        //the equals method will compare two strings to see if they are equal
        //will return a boolean value
        boolean result = name.equals("Tim");

        System.out.println(result);

        // the length method will return an integer based on the length of the string
        int count = name.length();
        System.out.println(count);

        //the charAt method will return a single character
        char position = name.charAt(1);
        System.out.println(position);

        //the indexOf method will return the index of where the letter is in the string
        int letterIndex = name.indexOf("T");
        System.out.println(letterIndex);

        //the isEmpty method checks to see if a string is empty, will return a boolean
        boolean disappear = name.isEmpty();
        System.out.println(disappear);

        //the toUpperCase method changes all the letters in the string to upper case
        String allCaps = nameOnly.toUpperCase();
        System.out.println(allCaps);

        //the trim method trims the empty space in the string
        String delSpace = nameOnly.trim();
        System.out.println(delSpace);

        //the replace method replaces a character with another in a string
        String sub = name.replace('i', 'u');
        System.out.println(sub);
    }
}
