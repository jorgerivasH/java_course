package chapter4;

import java.util.Random;

public class ExerciseRollTheDieGame {
    public static void main(String[] args) {

        //Initialize
        int spaceCounter=0;
        int moreToGo;

        for(int i=0; i<5; i++){
            Random random = new Random();
            int die = random.nextInt(6)+1;
            spaceCounter = spaceCounter+die;
            moreToGo = 20  - spaceCounter;
            System.out.println("Roll #"+ (i+1) +":" +" You've rolled a " +die+
                    " You are now on space " + spaceCounter + " and have " + moreToGo + " more to go.");
        }
        if(spaceCounter<20){
            System.out.println("You lose! you are on the space " + spaceCounter +" and is less than 20");
        }
        else if(spaceCounter==20){
            System.out.println("You win! You are on the space " + spaceCounter);
        }
        else if(spaceCounter>20){
            System.out.println("You lose! you are on the space " + spaceCounter + " and is greater than 20");
        }
    }
}
