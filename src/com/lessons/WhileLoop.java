package com.lessons;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        // while loop = executes a block of code as long as it's a condition remains true
        // like an if statement but it will continue that block of code as long as its
        // condition remains true

        Scanner scanner = new Scanner(System.in);

        String name = "";

        // the ".isBlank() will continue to be prompted until a name is entered
        while(name.isBlank()) {

            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }

        System.out.println("Hello "+ name);
    }
}
