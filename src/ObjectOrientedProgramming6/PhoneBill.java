package ObjectOrientedProgramming6;

/**
 * redo the phone bill calculator to use object-oriented approach.
 * phone bill should have an ID, a base cost, a number of allotted minutes and a number of minutes used.
 * It should also be able to calculate the overage, calculate the taxPercent, and calculate the total.
 * It should also be able to print an itemized bill.
 * You should also include three constructors
 * a default one
 * one that accepts the ID only
 * one that accepts all fields
 * Now no matter which of these constructors you use, all fields should be set.
 * Then you can also create a different class that instantiates the PhoneBill and prints out an itemized bill.
 */

public class PhoneBill {


    public static void main(String[] args) {

        PhoneBillCalculator phoneBill = new PhoneBillCalculator(22334, 35.00, 200, 300);

        phoneBill.printBill();


    }
}
