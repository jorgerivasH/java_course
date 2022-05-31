package prediktestSolution;

import java.util.Random;

public class CompareArrays {
    public static void main(String[] args) {
        /*Random random = new Random();
        int die = random.nextInt(6)+1;

        System.out.println(die);*/
        int max = 10;
        int min = 1;
        int range = max - min + 1;
        int ran = (int)(Math.random() * range) + min;
        System.out.println("Random Number:" + ran);

    }
}
