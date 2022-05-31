package chapter2;

import java.util.Scanner;

public class Exercise {
    public static void main(String args[]){
        //1. Ask a user for a season of the year
        System.out.println("Enter a season");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        //2. Ask a whole number
        System.out.println("Enter a whole number");
        int number = scanner.nextInt();

        //3. Ask a adjective
        System.out.println("Enter a adjective");
        String adjective = scanner.next();

        //4. output result
        System.out.println("On a [" + adjective +"]"+ "["+season+"]" + " day, I drink a minimum of " +
                "["+number+"]" + " cups of coffee" );

    }
}
