package JavaFundamentals2;//package declaration, to see where the class is

import java.util.Scanner;

public class GrossPayCalculator {
    //the curled braces are block of code, the orange words are reserved words, they mean something for the program, we cannot use it

    public static void main(String arg[]){

        //1. get the number of hours worked
        System.out.println("Enter the number of hours the employee worked.");
        // receive  the input
        Scanner scanner = new Scanner(System.in);
        //daclare a variable to save the value, needs to have the data type
        int hours = scanner.nextInt();

        //2. get the hourly pay rate.
        System.out.println("Enter the employee's pay rate.");
        double rate = scanner.nextDouble();
        //close the scanner to free the memory
        scanner.close();


        //3.Multiply hours and pay rate
        double grossPay = hours * rate;

        //4. Display Result.
        System.out.println("The employee gross pay is $" + grossPay);


    }
}
