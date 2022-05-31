package prediktestSolution;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TestSolutionTwo {
    public static int[] funcBoutique(int[] flowerStick, int random){
        int[] answer = new int[flowerStick.length];
        int[] firstElements = new int[random];
        int[] lastElements = new int[flowerStick.length - random];
        int[] lastElementsOrdered = new int[flowerStick.length - random];

        //Save the first elements in one Array
        for(int i = 0; i<random; i++){
            firstElements[i]= flowerStick[i];
        }

        //Save de last elements in one Array
        int index=0;
        for(int i = random; i<flowerStick.length; i++){
            lastElements[index]= flowerStick[i];
            index = index+1;
        }

        //order the first and the last Elements
        Arrays.sort(firstElements);
        Arrays.sort(lastElements);

        // create a new array order from major to minor working with answer2
        System.out.println("Array ordered from major to minor");
        int j=0;
        for(int i = lastElements.length-1; i>=0; i--){
            lastElementsOrdered[j]= lastElements[i];
            j++;
        }

        // Fill out the answer array with first array
        int indexAnswer=0;
        for( int i = 0; i<answer.length;i++){
            if(i < random){
                answer[i]=firstElements[i];
            }
            if (i >= random){
                answer[i]=lastElementsOrdered[indexAnswer];
                indexAnswer++;
            }
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
        //int random = in.nextInt();
        Random random = new Random();
        int randomNumber = random.nextInt(flowerStick_size)+1;
        System.out.println("The random is: "+ randomNumber);

        int[] result = funcBoutique(flowerStick, randomNumber);
        System.out.println("The result is");
        for(int idx = 0; idx < result.length; idx++){
            if(result[idx]!=0){

                System.out.print(result[idx]+" ");
            }
        }
    }
}
