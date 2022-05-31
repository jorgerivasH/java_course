package chapter3;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

/**
 * So, you're going to create a program that asks the user to enter the quantities for the following coins.
 *
 * You'll ask them how many pennies would you like?
 * How many nickels would you like?
 * How many dimes?
 * And then, how many quarters?
 * What your program is going to do is count up the value of all of the change that they answered.
 *
 * If it's exactly one dollar then they win the game.
 * If it's more than one dollar, then you need to tell them that it's more than one dollar and how much they went over.
 * If it's less than one dollar, tell them how much they went under.
 */
public class LogicalOperatorExercise {
    public static void main(String[] args) {
        //Initialize the know values
        double penniesValue = 0.01;
        double nickelsValue = 0.05;
        double dimesValue = 0.10;
        double quartersValue = 0.25;
        double total;

        //Asking to the user the information
        System.out.println("how many pennies would you like?");
        Scanner scanner = new Scanner(System.in);
        int pennies = scanner.nextInt();
        System.out.println("How many nickels would you like?");
        int nickels = scanner.nextInt();
        System.out.println("How many dimes?");
        int dimes = scanner.nextInt();
        System.out.println("And then, how many quarters?");
        int quarters = scanner.nextInt();

        total=((pennies*penniesValue)+(nickels*nickelsValue)+(dimes*dimesValue)+(quarters*quartersValue));

        if(total == 1){
            System.out.println("You win the game");
            System.out.println("The total is? $" + total );
        }
        else if(total > 1){
            System.out.println("You lost! it's more than one dollar, the total is? $" + total );
        }
        else if (total < 1){
            System.out.println("You lost! it's less than one dollar, the total is? $" + total);
        }
        else{
            System.out.println("Error!. The entered information is not valid! ");
        }
    }

}
