package chapter3;

import java.util.Scanner;

public class QuotaCalculator {

    public static void main(String[] args) {

        // initialize values we know
        int quota = 10;

        // get values we don't know
        System.out.println("Enter the number of sales you made this week:");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        // make a decision on the path to take -  output
        if(sales >= 10){
            System.out.println("Congrats you met your quota");
        }
        else{
            int salesShort = quota - sales;
            System.out.println("you did not make your quota. You were " + salesShort + " sales short.");
        }


    }
}
