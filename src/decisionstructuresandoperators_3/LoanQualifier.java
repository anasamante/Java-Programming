package decisionstructuresandoperators_3;


/*
 * NESTED IFS:
 * To qualify for a loan, a person must make at least $30,000
 * and have been working at their current job for at least 2 years.
 */


import java.util.Scanner;

public class LoanQualifier {
    public static void main(String[] args) {

        int requieredSalary = 30000;
        int requiredYearsEmployed = 2;

        System.out.println("Enter the salary:");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Enter number of years with current employeer");
        double years = scanner.nextDouble();

        scanner.close();

        if (salary >= requieredSalary){
            if(years >= requiredYearsEmployed) {
                System.out.println("Congrats, you qualified for the loan");
            }
            else{
                System.out.println("Sorry you must have worked at your current job "
                        + requiredYearsEmployed + " years");
            }
        }
        else{
            System.out.println("sorry you must earn at least " + requieredSalary + " to qualify for the loan");
        }
    }
}
