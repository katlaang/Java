package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 0;
        boolean first = true; //setting the flag so user can only enter first number once

        while (true) {
            System.out.println("Enter Number:");
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();
                if (first) { // checking if first number flag is set to true. when user enters the first number, the code will execute. when user enters second number, this if statement wont execute.
                    first = false;
                    min = number;
                    max = number;
                }
                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }

            } else {
                break;
            }
            scanner.nextLine(); //handle input
        }
        System.out.println("min = " + min + ", max = " + max);
        scanner.close();


        //Alternative code not using the boolean flag


       /* Scanner scanner = new Scanner(System.in);
        int min = 2147483647; // set the maximum integer value the minimum can have(Integer.MAX-VALUE can be used instead of typing the number
        int max = -2147483648; // Integer.MIN_VALUE

        while (true) {
            System.out.println("Enter Number:");
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();

                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }

            } else {
                break;
            }
            scanner.nextLine(); //handle input
        }
        System.out.println("min = " + min + ", max = " + max);
        scanner.close();
*/




    }



}
