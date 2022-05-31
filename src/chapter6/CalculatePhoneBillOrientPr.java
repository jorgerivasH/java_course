package chapter6;

import java.util.Scanner;

public class CalculatePhoneBillOrientPr {
    //Declaring variables
    int id;
    double baseCost;
    int allottedMinutes;
    double minutesUsed;

    //creating the constructors
    public CalculatePhoneBillOrientPr(){
        id = 0;
        baseCost = 0;
        allottedMinutes = 0;
        minutesUsed = 0;
    }
    public CalculatePhoneBillOrientPr(int id){
        this.id = id;
        baseCost = 0;
        allottedMinutes = 0;
        minutesUsed = 0;
    }
    public CalculatePhoneBillOrientPr(int id, double baseCost, int allottedMinutes, double minutesUsed){
        this.id = id;
        this.baseCost = baseCost;
        this.allottedMinutes = allottedMinutes;
        this.minutesUsed = minutesUsed;
    }

    //Creating the Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    public int getAllottedMinutes() {
        return allottedMinutes;
    }

    public void setAllottedMinutes(int allottedMinutes) {
        this.allottedMinutes = allottedMinutes;
    }

    public double getMinutesUsed() {
        return minutesUsed;
    }

    public void setMinutesUsed(double minutesUsed) {
        this.minutesUsed = minutesUsed;
    }

    //Methods that calculate the overage, tax and total
    public double calculateOverage(double overMin){
        double overageFee = overMin * 0.25;
        return overageFee;
    }

    public static double calculateTax(double subTotal){
        double tax = subTotal * 0.15;
        return tax;
    }

    public double calculateTotal(double planCost, double overage, double tax ){
        double total = (planCost+overage+tax);
        return total;
    }
}
