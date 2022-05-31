package prediktest;

import java.util.Scanner;

public class ArraysExamples {
    public static void main(String[] args) {
        String[] name = new String[4];

        for(int i=0; i <name.length; i++){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Add the element N: "+ (i+1));
            name[i] = scanner.next();
        }
        System.out.println("The elements in the arrays are:");
        for(int i=0; i <name.length; i++){
            System.out.println(name[i]);
        }
    }
}
