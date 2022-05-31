package prediktest;

import javax.print.DocFlavor;
import java.util.Scanner;

public class TestTwo {
    public static int[] largestLand(int[] []houses){
        int[] answer = new int[2];
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //input for houses
        System.out.println("input for inputDist");
        System.out.println("input row house");
        int houses_row = in.nextInt();
        System.out.println("input column house");
        int houses_col = in.nextInt();

        //Set the table
        int houses[][] = new int[houses_row][houses_col];

        //Fill out the matriz
        for(int idx = 0; idx < houses_row; idx++){

            for(int jdx = 0; jdx < houses_col; jdx++){

                houses[idx][jdx] = in.nextInt();
            }
            //continue;
        }



        int[] result = largestLand(houses);
        for(int idx = 0; idx <result.length - 1;idx++){
            System.out.println(result[idx] + "");
        }
        System.out.println(result[result.length-1]);

    }
}
