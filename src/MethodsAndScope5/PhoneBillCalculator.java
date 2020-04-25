import java.util.Scanner;

public class PhoneBillCalculator {
/*    allow the user to input the plan fee and the number of overage minutes.
      charge 25 cents for every over minute
      add 15% tax on the subtotal.
      Please print this as an itemized bill.
 */
    static double overMinuteCost = 0.25;
    static double tax = 0.15;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double planFee = askPlanFee();
        int overageMinutes = askOverageMin();
        scanner.close();

        double overage = chargeOverage(overageMinutes);

        double subtotalTax = calculateSubtotalTax(overage, planFee);

        double totalBill = calculateTotal(planFee, overage, subtotalTax);

        printTotalBill(planFee, overage, subtotalTax, totalBill);

    }

    public static double askPlanFee(){
        System.out.println("Enter base cost of the plan:");
        double planFee = scanner.nextDouble();
        return planFee;
    }

    public static int askOverageMin(){
        System.out.println("Enter overage minutes:");
        int overageMinutes = scanner.nextInt();
        return overageMinutes;
    }

    public static double chargeOverage(double overageMinutes){
        double overage = overMinuteCost * overageMinutes;
        return overage;
    }

    public static double calculateSubtotalTax(double overage, double planFee){
        double subtotalTax = (overage + planFee) * tax;
        return subtotalTax;
    }

    public static double calculateTotal(double planFee, double overage,double subtotalTax){
        double totalBill = planFee + overage + subtotalTax;
        return totalBill;
    }

    public static void printTotalBill(double planFee, double overage, double subtotalTax, double totalBill){
        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $" + planFee);
        System.out.println("Overage: $" + overage);
        System.out.println("Tax: $" + subtotalTax);
        System.out.println("Total: $" + totalBill);
    }

}
