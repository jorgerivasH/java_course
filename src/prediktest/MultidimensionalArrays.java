package prediktest;

import java.util.Arrays;

public class MultidimensionalArrays {
    public static void main(String[] args) {
        // [row] [column]
        int [][] matrix = {{1,2,3},{4,5,6}};

        for(int i=0; i< matrix.length;i++){
            for(int j=0; j< matrix[i].length;j++){

                System.out.print(matrix[0][i]);
                Arrays.sort(matrix);

            }
        }
    }
}
