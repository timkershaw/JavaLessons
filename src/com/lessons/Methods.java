package com.lessons;

public class Methods {
    public static void main(String[] args) {
        //method = a block of code that is executed whenever it is called upon

        String name = "Bro";
        int age = 22;

        //pass in a name variable, the argument
        hello(name,age);
    }
    //creating a new method name hello, string name is a parameter
    static void hello(String name, int age) {
        System.out.println("Hello "+name);
        System.out.println("You are "+age);
    }
}
