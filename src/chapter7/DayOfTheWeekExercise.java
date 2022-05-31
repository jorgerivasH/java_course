package chapter7;

import java.util.Scanner;

public class DayOfTheWeekExercise {

    public static String[] week = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Select the number of the day to see:");
        int daySelected = scanner.nextInt();
        System.out.println("The day selected was: " + week[daySelected-1]);


    }
}
