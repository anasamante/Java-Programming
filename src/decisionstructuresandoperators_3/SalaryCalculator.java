package decisionstructuresandoperators_3;

import java.util.Scanner;

/*
* IF Statement.
* All salespeople get a payment of $1000 a week.
* Salespeople who exceed 10 sales get an additional bonus of $250.
*/

public class SalaryCalculator {

    public static void main(String args[]){
        //Initialize the know values
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        //get values for unknown
        System.out.println("How many sales did the employee make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //if statement for bonus earner
        if(sales > quota){
            salary = salary + bonus;
        }

        // output
        System.out.println("The employee's pay is $ " + salary);
    }
}
