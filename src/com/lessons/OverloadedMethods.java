package com.lessons;

public class OverloadedMethods {
    public static void main(String[] args) {

        //overloaded methods = methods that share the same name but have different parameters
        //method name + parameters = method signature

        int x = add(1,2);

        System.out.println(x);

        int meth2 = add(1,2,3);
        System.out.println(meth2);

        int meth3 = add(1,2,3,4);
        System.out.println(meth3);
    }

    //three methods with the same method name but different parameters
    static int add(int a, int b) {
        System.out.println("This is overloaded method #1");
        return a + b;
    }
    //overloaded method 2
    static  int add(int a, int b, int c) {
        System.out.println("This is overloaded method #2");
        return a + b + c;
    }
    //overloaded method 3
    static  int add(int a, int b, int c, int d) {
        System.out.println("This is overloaded method #3");
        return a + b + c + d;
    }
}
