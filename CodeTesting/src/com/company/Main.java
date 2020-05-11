package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        System.out.println(hasSameLastDigit(9, 99, 999));
////        System.out.println(isValid(1051));
////        System.out.println(getGreatestCommonDivisor(12, 30));
//        System.out.println(printFactors(6));
//        System.out.println(isPerfectNumber(6));
//        System.out.println(numberToWords(100));
//        System.out.println(canPack(1,0,5));
//        System.out.println(getLargestPrime(0));
        System.out.println(printSquareStar(20));

    }

    public static boolean hasSameLastDigit(int a, int b, int c) {

        int lastDigita = a % 10;
        int lastDigitb = b % 10;
        int lastDigitc = c % 10;

        if ((a < 10 || a > 1000) || (b < 10 || b > 1000) || (c < 10 || c > 1000)) {
            return false;
        }
        return ((lastDigita == lastDigitb) || (lastDigita == lastDigitc) || (lastDigitb == lastDigitc));

    }

    public static boolean isValid(int d) {

        if (d < 10 || d > 1000) {
            return false;
        }
        return true;
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) return -1;
        int gcd = 0;
        for (int i = 1; i <= first && i <= second; i++) {
            if (first % i == 0 && second % i == 0)
                gcd = i;
        }
        return gcd;

    }

    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        }
        int factor = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factor = i;
                System.out.println(i + " ");
            }
        }
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) return false;

        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0)
                sum += i;
        }
        return sum == number;

    }

    public static String numberToWords(int number) {
        String numberToString = "";
        if (number < 0) System.out.println("InvalidValue");
        int digitCount = getDigitCount(number);  //get the digits in a given number
        int reversedNumber = reverse(number); //reversing the number
        number = 0;
        while (digitCount > 0) {
            number = reversedNumber % 10;
            reversedNumber /= 10;
            digitCount -= 1;
            switch (number) {
                case 0:
                    numberToString += "Zero";
                    break;
                case 1:
                    numberToString += "One";
                    break;
                case 2:
                    numberToString += "Two";
                    break;
                case 3:
                    numberToString += "Three";
                    break;
                case 4:
                    numberToString += "Four";
                    break;
                case 5:
                    numberToString += "Five";
                    break;
                case 6:
                    numberToString += "Six";
                    break;
                case 7:
                    numberToString += "Seven";
                    break;
                case 8:
                    numberToString += "Eight";
                    break;
                case 9:
                    numberToString += "Nine";
                    break;
                default:
                    break;


            }


        }
        return (numberToString);


    }

    public static int reverse(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            reversedNumber = (reversedNumber * 10) + number % 10;
            number /= 10;
        }
        return reversedNumber;
    }

    public static int getDigitCount(int number) {
        if (number < 0) return -1;
        int digitCount = 0;
        if (number == 0) digitCount = 1;
        while (number >= 0) {
            digitCount += 1;
            number /= 10;
        }
        return digitCount;


    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) return false;

        if (goal > ((bigCount * 5) + smallCount)) return false;
        if ((goal % 5) > smallCount) return false;
        return true;
    }

    public static int getLargestPrime(int number) {
        int i;
        if (number <= 1) return -1;
        for ( i = 2; i <= number; i++) {
            if (number % i == 0) {
                number = number / i;
                i--;

            }

        }
        return i;

    }
    public static String printSquareStar(int number){
        if (number< 5) System.out.println("Invalid Value");
        int row;
        int column;
        for(row=0; row<number;row++ ){
            for (column=0; column<number; column ++){
                if(row==0|| row ==number-1 || column ==0 || column ==number -1 || row ==column || (row+column) == number-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
        return ("Number of stars is " + number);
    }

    public static void inputThenPrintSumAndAverage () {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double count = 0;
        double average=0;
        while (count <= 10) {
            boolean hasNextInt= scanner.hasNextInt();
            if (hasNextInt) {
                sum += scanner.nextInt();
                count++;


            } else break;


            scanner.nextLine();
        }

        average =  Math.round(sum / count);
        int myAverage= (int) average;
        int mySum =(int) sum;
        System.out.println("SUM = " + mySum + " AVG = " + myAverage );
        scanner.close();

    }


}

