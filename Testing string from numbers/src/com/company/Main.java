package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(numberToWords(200));



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
            return numberToString;
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
            }return digitCount;



        }
    }

