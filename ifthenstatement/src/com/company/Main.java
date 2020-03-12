package com.company;

public class Main {

    public static void main(String[] args) {
        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println(" It is not an alien!");
            System.out.println("And I am scared of Aliens!");
        }
        int topScore = 80;
        if (topScore <= 100){
            System.out.println("You got the high score!");

        }
        int secondTopscore = 60;
        if (topScore > secondTopscore && topScore <100){
            System.out.println("Greater than second top score and less than 100");
        }


        if ((topScore > secondTopscore) && (topScore <100)){
            System.out.println("Greater than second top score and less than 100");
        }
        //OR operator
        if ((topScore > 90 ) || (secondTopscore <= 90)){
            System.out.println("Either or both of the conditions are true");

        }
         int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }











































    }
}
