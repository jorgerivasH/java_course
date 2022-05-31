package chapter6;

import java.util.Scanner;

public class CalculatePhoneBillOrientPrTwo {
    public static void main(String[] args) {
        double overageMinutes = 0;
        double overageCost = 0;
        double subTotal = 0;

        Scanner scanner = new Scanner(System.in);
        CalculatePhoneBillOrientPr bill1 = new CalculatePhoneBillOrientPr();

        //Fill out the object
        System.out.println("Enter id of the plan:");
        bill1.id = scanner.nextInt();

        System.out.println("Enter base cost of the plan:");
        bill1.baseCost = scanner.nextDouble();

        System.out.println("Enter allotted Minutes of the plan:");
        bill1.allottedMinutes = scanner.nextInt();

        System.out.println("Enter minutes Used of the plan:");
        bill1.minutesUsed = scanner.nextDouble();

        if(bill1.minutesUsed < bill1.allottedMinutes){
            overageMinutes = 0;
        }
        else{
            overageMinutes = bill1.minutesUsed - bill1.allottedMinutes;
            overageCost = bill1.calculateOverage(overageMinutes);
        }

        // Subtotal
        subTotal = bill1.getBaseCost() + overageCost;

        //Print an itemized bill
        System.out.println("");
        System.out.println("------------------------------------------------------");
        System.out.println(" The id of the plan is: " + bill1.getId());
        System.out.println(" The Cost of the plan is: " + bill1.getBaseCost());
        System.out.println(" The allotted Minutes of the plan is: " + bill1.getAllottedMinutes());
        System.out.println(" The minutes used of the plan are: " + bill1.getMinutesUsed());
        System.out.println(" The the overage is: " + overageCost);
        System.out.println(" The tax is: " + CalculatePhoneBillOrientPr.calculateTax(subTotal));
        System.out.println(" The total is: " + bill1.calculateTotal(bill1.getBaseCost(),overageCost, CalculatePhoneBillOrientPr.calculateTax(subTotal)));

    }
}
