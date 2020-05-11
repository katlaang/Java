package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000, 2.0));

        for (int i = -0; i < 5; i++) {  // for (init; termination; increment)
            System.out.println("Loop " + i + " hello!");

        }
        for (int i = 2; i < 9; i++) {
            System.out.println("10,000 at " + i + " % interest = " + String.format("%.2f", calculateInterest(10000, i)));

        }
        System.out.println("************************************");
        // modify so the loop starts at 8% and ends at 2%
        for (int i = 8; i >= 2; i--) {
            System.out.println("10,000 at " + i + " % interest = " + String.format("%.2f", calculateInterest(10000, i)));

        }
        // Create a for statement using any range of numbers
        // Determine if the number is a prime number using the isPrime method
        // if it is a prime number, print it out AND increment a count of the
        // number of prime numbers found
        // if that count is 3 exit the for loop
        // hint:  Use the break; statement to exit
        System.out.println("*************************************");
        int count = 0;
        for (int i=10; i<50; i++){
            if (isPrime(i)){
                count ++;
                System.out.println("Number " + i + " is a prime number");
                if (count ==3){
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }

    }
    public static double calculateInterest(double amount, double interestRate){
        return (amount *(interestRate/100));
    }



    public static boolean isPrime(int n) {


        if(n == 1) {
            return false;
        }

        for(int i=2; i <= (long) Math.sqrt(n); i++) {
            System.out.println("Looping " +i);
            if(n % i == 0) {
                return false;
            }
        }

        return true;

    }


}
