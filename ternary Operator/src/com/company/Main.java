package com.company;

public class Main {

    public static void main(String[] args) {

        boolean isCar = false;
        if(isCar) { // used (if(isCar==true) or if(!isCar vhecking isCar is not equalt to true
            System.out.println("This is not supposed to happen");
        }
        //Ternary operator
        isCar = true;
        boolean wasCar= isCar ? true:false;
         if (wasCar) {
            System.out.println("wasCar is true");
        }

         //Coding challenge

        double myFirstDouble= 20.00d;
         double mySecondDouble=80.00d;
         double myTotalDouble= 100.00d*(myFirstDouble + mySecondDouble);
         double myDoubleRemainder = myTotalDouble % 40.00d;
        System.out.println(myDoubleRemainder);

       boolean isNoRemainder = (myDoubleRemainder ==0) ? true: false;
        System.out.println("isNoRemainder = " + isNoRemainder);
        if (!isNoRemainder){
            System.out.println("Got some remainder");
        }




    }
}
