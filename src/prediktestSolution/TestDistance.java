package prediktestSolution;

import java.util.Scanner;

public class TestDistance {
    public static int[] funcDistance(int[] inputDist, int start, int end){
        int[] answer = new int[inputDist.length];
        for(int i = 0; i<inputDist.length; i++){
            if(inputDist[i]>=start&&inputDist[i]<=end){
                answer[i]=inputDist[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //input for inputDist
        System.out.println("input for inputDist");
        int inputDist_size = in.nextInt();
        int inputDist[] = new int[inputDist_size];
        for(int idx = 0; idx < inputDist_size; idx++){
             inputDist[idx] = in.nextInt();
        }
        //input for start
        System.out.println("input for start");
        int start = in.nextInt();
        //input for end
        System.out.println("//input for end");
        int end = in.nextInt();

        int[] result = funcDistance(inputDist, start, end);
        System.out.println("The result is");
        for(int idx = 0; idx < result.length; idx++){

            if(result[idx]!=0){

                System.out.print(result[idx]+" ");
            }
        }
    }
}
