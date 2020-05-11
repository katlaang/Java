package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(isPalindrome(707));
//        int count = 0;
//        while (count != 5) {
//            System.out.println("Count value is " + count);
//            count++;
//        }
//        System.out.println("***************************************");
//        for (count = 0; count != 5; count++) {
//            System.out.println("Count value is " + count);
//        }
//
//        count = 0;
//        while (true) {
//            if (count == 5) {
//                break;
//            }
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        count = 0;
//        do {
//            System.out.println("Count value is " + count);
//            count++;
//            if (count > 100) {
//                break;
//            }
//        } while (count != 5);
//        int number =4;
//        int finishNumber = 20;
//        while(number <= finishNumber){
//            number ++;
//            if(!isEvenNumber(number)){
//                continue;
//            }
//            System.out.println("Even number " + number);
//
//        }
        int number =4;
        int finishNumber = 20;
        int evenNumbersFound =0;
        while(number <= finishNumber){
            number ++;
            if(!isEvenNumber(number)){
                continue;
            } System.out.println("Even number " + number);

            evenNumbersFound ++;
            if(evenNumbersFound >=5){
                break;
            }


        }
        System.out.println("Total even numbers found = " + evenNumbersFound);
    }

	//Coding challenge
    public static  boolean isEvenNumber(int number){
        if (number %2 ==0){
            return true;
        }return false;





    }
    public static boolean isPalindrome(int number){
        int palidrome=number;
        int reverse =0;

        while (palidrome !=0){
            int remainder = palidrome % 10;
            reverse=reverse *10 +remainder;
            palidrome = palidrome /10;
        }
        return number ==reverse;

    }


    }

























}
