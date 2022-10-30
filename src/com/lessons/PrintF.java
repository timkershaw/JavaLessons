package com.lessons;

public class PrintF {
    public static void main(String[] args) {

        /*
        printf() = an optional method to control, format, and display text to the console window
        two arguments = format string + (object/variable/value)
        % [flags] [precision] [width] [conversion-character]
         */

        //the %d will place 123 in the beginning of the print statement
        System.out.printf("%d This is a format string\n",123);

        //conversion character is a letter that appears after the format specifier
        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Tim";
        int myInt = 50;
        double myDouble = 1000;

        //for boolean value
        System.out.printf( " %b \n" , myBoolean );

        //for character
        System.out.printf("%c \n", myChar);

        //for string
        System.out.printf("%s \n", myString);

        //for integers
        System.out.printf("%d \n",myInt);

        //for double
        System.out.printf("%f \n", myDouble);

        //minimum number of characters to be written as output
        System.out.printf("Hello %10s \n", myString);

        //precision
        //sets number of digits of precision when outputting floating point values
        System.out.printf("You have this much money %.2f \n", myDouble);

        /*
        [flags]
        adds an effect to output based on the flag added to format specifier
        - : left-justify
        + : output a plus ( + ) or minus ( - ) sign for numeric value
        0 : numberic values are zero-padded
        , : comma grouping separator if numbers > 1000
         */
        System.out.printf("You have this much money %+f \n",myDouble);
    }
}
