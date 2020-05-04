package decisionstructuresandoperators_3;

import java.util.Scanner;

/*
* You're going to make a game — the objective of the game is to enter enough change to equal exactly one dollar.
* So, you're going to create a program that asks the user to enter the quantities for the following coins.
*
* You'll ask them how many pennies would you like?
* How many nickels would you like?
* How many dimes?
* And then, how many quarters?
* What your program is going to do is count up the value of all of the change that they answered.
*
* If it's exactly one dollar then they win the game.
* If it's more than one dollar, then you need to tell them that it's more than one dollar and how much they went over.
* If it's less than one dollar, tell them how much they went under.
* Feel free to change this game for your country's currency, so if you don't use dollars and you use something else that's fine
 */

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