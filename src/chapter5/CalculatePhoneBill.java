package chapter5;

import java.util.Scanner;

public class CalculatePhoneBill {


    public static void main(String[] args) {

        //Declaring variables
        double baseCost;
        int overageMinute;
        double OverageMin;
        double subTotal;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter base cost of the plan:");
        baseCost = scanner.nextDouble();

        System.out.println("Enter overage minute:");
        overageMinute = scanner.nextInt();

        OverageMin = calculateOverage(overageMinute);
        subTotal = baseCost + OverageMin;

        System.out.println("Phone Bill statements");
        System.out.println("Plan: $" + baseCost);
        System.out.println("Overage: $" + OverageMin);
        System.out.println("Tax: $" + calculateTax(subTotal));
        System.out.println("Total: $" + calculateTotal(baseCost, OverageMin, calculateTax(subTotal)));
    }

    public static double calculateTax(double subTotal){
        double tax = subTotal * 0.15;
        return tax;
    }

    public static double calculateOverage(int overageMinute){
        double overageFee = overageMinute * 0.25;
        return overageFee;
    }

    public static double calculateTotal(double planCost, double overage, double tax ){
        double total = (planCost+overage+tax);
        return total;
    }
}
