package ObjectOrientedProgramming6;

/**
 * redo the phone bill calculator to use object-oriented approach.
 * phone bill should have an ID (22344), a base cost(10.00), a number of allotted minutes (500) and a number of minutes used(525).
 * ***It should also be able to calculate the overage((minutes used - alloted minutes)* 0.25),
 * calculate the taxPercent(15% of basecost+minOvercost), and calculate the total(subtotal+ taxPercent).
 * It should also be able to print an itemized bill.
 * You should also include three constructors
 * a default one
 * one that accepts the ID only
 * one that accepts all fields
 * Now no matter which of these constructors you use, all fields should be set.
 * create a different class that instantiates the PhoneBill and prints out an itemized bill.
 */

public class PhoneBillCalculator {

    private int phoneBillID;
    private double baseCost;
    private int includedMin;
    private int usedMin;


    //default constructor without parameters
    public PhoneBillCalculator() {
        phoneBillID = 2234;
        baseCost = 10.00;
        includedMin = 500;
        usedMin = 550;
    }

    //constructor with ID parameter
    public PhoneBillCalculator(int phoneBillID) {
        setPhoneBillID(phoneBillID);
        setBaseCost(10.00);
        setIncludedMin(500);
        setUsedMin(440);
    }

    //constructor with all parameters
    public PhoneBillCalculator(int phoneBillID, double baseCost, int includedMin, int usedMin) {
        setPhoneBillID(phoneBillID);
        setBaseCost(baseCost);
        setIncludedMin(includedMin);
        setUsedMin(usedMin);
    }

    public int getPhoneBillID() {
        return phoneBillID;
    }

    public void setPhoneBillID(int phoneBillID) {
        this.phoneBillID = phoneBillID;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    public int getIncludedMin() {
        return includedMin;
    }

    public void setIncludedMin(int includedMin) {
        this.includedMin = includedMin;
    }

    public int getUsedMin() {
        return usedMin;
    }

    public void setUsedMin(int usedMin) {
        this.usedMin = usedMin;
    }

    public double calculateTotalOverageCost() {
        int minOver;
        double minOverCost = 0.25;
        if (usedMin <= includedMin){
            minOver = 0;
        }
        else {
            minOver = usedMin - includedMin;
        }
        return minOver * minOverCost;
    }

    public double calculateTax() {
        double taxPercent = 0.15;
        return (baseCost + calculateTotalOverageCost()) * taxPercent;
    }

    public double calculateTotal() {
        return baseCost + calculateTotalOverageCost() + calculateTax();
    }

    public void printBill(){
        System.out.println("Phone Bill Statement");
        System.out.println("Bill ID: " + phoneBillID);
        System.out.println("Plan: $" + baseCost);
        System.out.println("Overage: $" + calculateTotalOverageCost());
        System.out.println("Tax: $" + calculateTax());
        System.out.println("Total: $" + calculateTotal());
    }

}
