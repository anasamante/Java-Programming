package chapter3;

import java.util.Scanner;

public class ChangeForADollar {
    public static void main(String[] args) {

        int pennyWorth = 1;
        int nickelWorth = 5;
        int dimeWorth = 10;
        int quarterWorth = 25;
        int changeGoal = 100;

        System.out.println("Your goal is to enter enough change to make exactly $1.00. Enter your number of pennies:");
        Scanner scanner = new Scanner(System.in);
        int pennyQuantity = scanner.nextInt();

        System.out.println("Enter your number of nickels:");
        int nickelQuantity = scanner.nextInt();

        System.out.println("Enter your number of dimes:");
        int dimeQuantity = scanner.nextInt();

        System.out.println("Enter your number of quarters:");
        int quarterQuantity = scanner.nextInt();
        scanner.close();

        int totalPennies = pennyWorth * pennyQuantity;
        int totalNickel = nickelWorth * nickelQuantity;
        int totalDimes = dimeWorth * dimeQuantity;
        int totalQuarter = quarterWorth * quarterQuantity;
        int userTotalMoney = totalDimes + totalNickel + totalPennies + totalQuarter;

        if(userTotalMoney == changeGoal){
            System.out.println("That equals a dollar, You win!");
        }else if (userTotalMoney > changeGoal){
            System.out.println("You went over the goal by " + (userTotalMoney - changeGoal) + " cents");
        }
         else {
            System.out.println("You need " + (changeGoal - userTotalMoney) + " more cents to reach the goal");
        }
    }
}