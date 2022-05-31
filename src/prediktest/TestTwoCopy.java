package prediktest;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import static java.util.Collections.reverseOrder;

public class TestTwoCopy {
    public static int[] largestLand(int[] []houses){
        int[] answer = new int[2];
        int[] answerTwo = new int[2];
        int indexOne= 0;
        int indexTwo= 0;
        //Logica
        int[] copy= new int[houses.length];
        for (int i=0; i< houses.length;i++){
            copy[i]=houses[i][1];
        }

        for (int i=0;i<2;i++){
            int copyLenght= copy.length;
            Arrays.sort(copy);
            answer[i]= copy[copyLenght-(i+1)];
            System.out.println("El index es"+ indexOne);
        }


        return answer;
    }
  // Found index
    public static void foundIndex(int[][] houses, int[] result){
        int index = Arrays.asList(houses[0]).indexOf(result[0]);
        int indext = Arrays.asList(houses[1]).indexOf(result[1]);
        System.out.println("index son:" + index + indext);
        //return index;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //input for houses
        System.out.println("input for inputDist");
        System.out.println("numero de casas");
        int houses_row = in.nextInt();
        //System.out.println("input column house");
        int houses_col = 2;

        //Set the table
        int houses[][] = new int[houses_row][houses_col];

        //Fill out the matriz
        System.out.println("Fill out the matriz");
        for(int idx = 0; idx < houses_row; idx++){
            System.out.println("Agregar numero de casa y posicion");
            for(int jdx = 0; jdx < houses_col; jdx++){

                houses[idx][jdx] = in.nextInt();
            }
            //continue;
        }

        //Imprimir el arreglo
        System.out.println("Print the matriz");
        for(int idx = 0; idx < houses.length; idx++){

            for(int jdx = 0; jdx < houses[idx].length; jdx++){
                System.out.print(houses[idx][jdx]+" ");
            }
            System.out.println();
            //continue;
        }


        System.out.println("Imprimiendo copia");
        int[] result = largestLand(houses);
        for(int idx = 0; idx <result.length;idx++){
            System.out.print(result[idx] + " ");
        }
        //System.out.println(result[result.length-1]);

        foundIndex(houses,result);

    }
}
