package loops_4;

import java.util.Scanner;

/*
 * FOR LOOP:
 * Write a cashier program that will scan a given number of items and tally the cost.
 */

public class Cashier {
    public static void main(String[] args) {
        //get the number of items to scan

        System.out.println("how many items do you have?");
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();

        double total = 0;

        for(int i=0; i<quantity; i++){
            System.out.println("Enter the cost of the item");
            double price = scanner.nextDouble();

            total = total + price;

        }
        scanner.close();
        System.out.println("Your total is " + total);
    }

}
