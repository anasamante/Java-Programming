package Loops4;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        /*
         * DO WHILE LOOP:
         * Write a program that allows a user to enter two numbers,
         * and then sums up the two numbers. The user should be able to
         * repeat this action until they indicate they are done.
         */
        Scanner scanner = new Scanner(System.in);

        boolean again;

        do {
            System.out.println("Give me the first number");
            double firstNumber = scanner.nextDouble();

            System.out.println("Give me the second number");
            double secondNumber = scanner.nextDouble();

            double total = firstNumber + secondNumber;


            System.out.println("The total is " + total);
            System.out.println("Would you like to try again? True or False");

            again = scanner.nextBoolean();

        } while(again);

        scanner.close();

    }
}
