package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(isOdd(2));
        System.out.println(sumOdd(1, 11));
        //Create a for statement using a range of numbers from 1 to 1000 inclusive.
        //
        //Sum all the numbers that can be divided with both 3 and also with 5.
        //
        //For those numbers that met the above conditions, print out the number.
        //
        //break out of the loop once you find 5 numbers that met the above conditions.
        //
        //After breaking out of the loop print the sum of the numbers that met the above conditions.
        //
        //Note: Type all code in main method
        int sum=0;
        int count =0;
        for (int i=1; i<=1000; i++){
            if ((i%3 ==0) && (i%5==0)) {
                count++;
                sum += i;
                System.out.println(i);
            }
                if (count ==5){
                    System.out.println("Exiting loop");
                break;
            }
        }
        System.out.println("The sum is "+ sum);
    }
    //Write a method called isOdd with an int parameter and call it number. The method needs to return a boolean.
    //
    //Check that number is > 0, if it is not return false.
    //
    //If number is odd return true, otherwise  return false.
    //
    //Write a second method called sumOdd that has 2 int parameters start and end, which represent a range of numbers.
    //
    //The method should use a for loop to sum all odd numbers  in that range including the end and return the sum.
    //
    //It should call the method isOdd to check if each number is odd.
    //
    //The parameter end needs to be greater than or equal to start and both start and end parameters have to be greater than 0.
    //
    //If those conditions are not satisfied return -1 from the method to indicate invalid input.
    //
    //Example input/output:
    //
    //* sumOdd(1, 100); → should return 2500
    //
    //* sumOdd(-1, 100); →  should return -1
    //
    //* sumOdd(100, 100); → should return 0
    //
    //* sumOdd(13, 13); → should return 13 (This set contains one number, 13, and it is odd)
    //
    //* sumOdd(100, -100); → should return -1
    //
    //* sumOdd(100, 1000); → should return 247500
    //
    //
    //TIP: use the remainder operator to check if the number is odd
    //
    //NOTE: Both methods  needs to be defined as public static like we have been doing so far in the course.
    //NOTE: Do not add a  main method to solution code.

    public static boolean isOdd(int param){
        if (param<=0){
            return false;
        }else if( param%2 !=0){
            return true;
        }return false;
    }
    public static int sumOdd(int start, int end){
        int sum =0;
        if(start<=0 || end <=0 || start>=end){
            return -1;

        }
        for (int i=start; i<=end; i++){
            if(isOdd(i) ==true){
                sum +=i;
            }
        }
        return sum;
    }
}
