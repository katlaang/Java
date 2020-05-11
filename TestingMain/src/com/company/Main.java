package com.company;

public class Main {

    public static void main(String[] args) {
       System.out.println(sumFirstAndLastDigit(5));
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(hasSharedDigit(15,43));
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(isValid(10));

  }
//           public static int sumFirstAndLastDigit(int number){
//            if (number <0){
//                return -1;
//            }
//
//            int sum= 0;
//            //get the last digit of the number
//            int lastDigit = number % 10;
//            //get the first digit of the number
//            int firstDigit =number;
//            while(firstDigit >=10){
//                firstDigit /= 10;
//            }
//            return sum = firstDigit+lastDigit;
//
//        }
////
//    public static int getEvenDigitSum(int number){
//        if (number < 0){
//            return -1;
//        }
//        int sum =0;
//        while(number >0){
//            if((number%10)%2==0){
//                sum += number%10;
//            }
//            number /= 10;
//        }
//        return sum;
//    }
//
//    public static boolean hasSharedDigit(int a, int b){
//        int lefta=a/10;
//        int righta=a%10;
//        int leftb= b/10;
//        int rightb =b%10;
//        if (((a < 10) || (a > 99)) ||((b < 10) || (b > 99))){
//            return false;
//
//        } return (lefta ==leftb || lefta==rightb || righta == leftb || righta ==rightb);

    }

    public static boolean hasSameLastDigit(int a, int b, int c) {

        lastDigita = a % 10;
        lastDigitb = b % 10;
        lastDigitc = c % 10;

        if ((a < 10 || a > 1000) || (b < 10 || b > 1000) || (c < 10 || c > 1000)) {
            return false;
        }
        return ((lastDigita == lastDigitb) || (lastDigita == lastDigitc) || (lastDigitb == lastDigitc));

    }

    public static boolean isValid(int d) {

        if (d < 0 || d > 1000) {
            return false
        } return true;
    }


}


