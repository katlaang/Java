package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPrimeHappy(0));
    }

    public static boolean isPrime(int n){
        if(n <1) return false;
        for (int i=2; i< n; i++){
            if (n%i ==0) return false;
        }
        return true;
    }

    public static int isPrimeHappy (int n){
        int sum = 0;
        int number =2;
        boolean primeFlag = false;
        while (number < n){
            if(isPrime(number)){
                primeFlag = true;
                sum +=number;
            }
            number++;
        }
        if(primeFlag && (sum%n ==0)) return 1;
        else return 0;

    }
}
