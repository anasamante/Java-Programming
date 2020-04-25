package chapter3;

import java.util.Scanner;

public class GradeMessage {
    /*
     * SWITCH
     * Have a user enter their letter grade, and using a switch statement,
     * print out a message letting them know how they did.
     */

    public static void main(String[] args) {
        System.out.println("Enter letter grade:");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        String message;

        switch (grade){
            case "A":
                message = "Excellent!";
                break;
            case "B":
                 message = "very good";
                 break;
            case "C":
                message = " good";
                break;
            case "D":
                message = "almost";
                break;
            case "F":
                message = "uh no";
                break;
             default:
                 message = "Invalid grade";
                 break;
        }
        System.out.println(message);

    }

}
