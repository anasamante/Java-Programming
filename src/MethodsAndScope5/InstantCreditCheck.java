import java.util.Scanner;

public class InstantCreditCheck {

    /*
     * VARIABLE SCOPE
     * Write an 'instant credit check' program that approves
     * anyone who makes more than $25,000 and has a credit score
     * of 700 or better. Reject all others.
     */

    static int reqSalary = 25000;
    static int reqCreditScore = 700;

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double userSalary = getUserSalary();
        int userScore = getUserScore();
        scanner.close();
        boolean qualified = isUserQualified(userSalary, userScore);
        notifyUser(qualified);
    }

    public static double getUserSalary(){
        System.out.println("What's your salary?");
        double userSalary = scanner.nextDouble();
        return userSalary;
    }

    public static int getUserScore(){
        System.out.println("What's your credit score");
        int userCreditScore = scanner.nextInt();
        return userCreditScore;
    }

    public static boolean isUserQualified(double userSalary, int userScore){
        if(userSalary > reqSalary && userScore >= reqCreditScore){
            return true;
        }
        else {
            return false;
        }
    }

    public static void notifyUser(boolean isQualified){
        if(isQualified){
            System.out.println("you qualify for the credit");
        }
        else {
            System.out.println("You don't qualify");
        }
    }
}
