package MethodsAndScope5;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        /*
         * OUR FIRST METHOD
         * Write a method that asks a user for their name, then greets them by name.
         */

        System.out.println("What's your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        greetUser(name);
    }

    public static void greetUser(String name){
        System.out.println("Hi " + name);
    }
}
