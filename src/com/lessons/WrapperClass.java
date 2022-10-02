package com.lessons;

public class WrapperClass {
    public static void main(String[] args) {
        /* wrapper class = provides a way to use primitive data types as reference date types
            reference data types contains useful methods
            can be used with collections (ex. ArrayList)

            primitive     wrapper - the first letter is capital and spelled out
            --------      -------
            boolean       Boolean
            char          Character
            int           Integer
            double        Double

            autoboxing = the automatic conversion that the Java compiler makes between the primitive
            types and their corresponding object wrapper classes

            unboxing = the reverse of autoboxing. Automatic conversion of wrapper class to primitive
            types
         */

        //will use autoboxing assign a primitive type to each corresponding wrapper class
        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
        String e = "Tim";

        if (a==true) {
            System.out.println("This is true");
        }

    }
}
