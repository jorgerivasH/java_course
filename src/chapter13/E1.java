package chapter13;

import java.util.*;

public class E1 {
    Scanner entrada = new Scanner(System.in);
    int numero;

    void ingresarDatosArray(int[] Array){
        for(int i = 0; i < Array.length; i++){
            System.out.println("Ingrese el valor del array " + i);
            Array[i] = entrada.nextInt();
        }
    }
    public static void main(String[] args) {
        E1 main = new E1();

        System.out.println("Ingrese la cantidad de valores que desea que contenga su array");
        main.numero = main.entrada.nextInt();

        int[] Array = new int[main.numero];

        main.ingresarDatosArray(Array);

        System.out.println("Los valores de su array son: " + Arrays.toString(Array));
    }
}

