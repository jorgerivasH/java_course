package prediktest;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Stream;

public class TestSolution {
    public static int[] funcBoutique(int[] flowerStick, int random){
        int[] answer = new int[flowerStick.length];
        int[] answer1 = new int[random];
        int[] answer2 = new int[flowerStick.length - random];
        int[] orderMaM = new int[flowerStick.length - random];

        //Order the first array for the number according to the random
        for(int i = 0; i<random; i++){
            answer1[i]= flowerStick[i];
        }

        //Order the second  array
        int index=0;
        for(int i = random; i<flowerStick.length; i++){
            answer2[index]= flowerStick[i];
            index = index+1;
        }

        //order the array 1 and 2
        Arrays.sort(answer1);
        Arrays.sort(answer2);
        // The answer 2 is ordered here
        System.out.println("Print Answer 2");
        for(int i =0;i<answer2.length; i++ ){
            System.out.println(answer2[i]);
        }

        // create a new array order from major to minor working with answer2
        System.out.println("Array ordered from major to minor");
        int j=0;
        for(int i = answer2.length-1; i>=0; i--){
            orderMaM[j]= answer2[i];
            j=0+1;
        }

        // Fill out the answer array with first array
        for( int i = 0; i<answer1.length;i++){
            answer[i]=answer1[i];
        }

        // Fill out the answer array with second array

        for( int i = 0; i<orderMaM.length;i++){
            answer[random]=orderMaM[i];
            random=random+1;
        }



        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //input for flower stick
        System.out.println("input for flower stick");
        int flowerStick_size = in.nextInt();
        int flowerStick[] = new int[flowerStick_size];

        System.out.println("Add the flower stick "+ flowerStick_size);
        for(int idx = 0; idx < flowerStick_size; idx++){
            flowerStick[idx] = in.nextInt();
        }
        //input for random
        System.out.println("input for random");
        int random = in.nextInt();

        int[] result = funcBoutique(flowerStick, random);
        System.out.println("The result is");
        for(int idx = 0; idx < result.length; idx++){
            if(result[idx]!=0){

                System.out.print(result[idx]+" ");
            }
        }
    }
}
