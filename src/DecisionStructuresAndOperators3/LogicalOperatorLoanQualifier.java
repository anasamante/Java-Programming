package DecisionStructuresAndOperators3;


/*
 * LOGICAL OPERATOR:
 * To qualify for a loan, a person must make at least $30,000
 * and have been working at their current job for at least 2 years.
 */


import java.util.Scanner;

public class LogicalOperatorLoanQualifier {
    public static void main(String[] args) {

        int requieredSalary = 30000;
        int requiredYearsEmployed = 2;

        System.out.println("Enter the salary:");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Enter number of years with current employeer");
        double years = scanner.nextDouble();

        scanner.close();

        if (salary >= requieredSalary && years >= requiredYearsEmployed) {
            System.out.println("Congrats, you qualified for the loan");
        }
        else{
            System.out.println("sorry you must earn at least " + requieredSalary + " to qualify for the loan");
        }
    }
}
