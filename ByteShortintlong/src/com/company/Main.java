package com.company;

public class Main {

    public static void main(String[] args) {
	    int myValue = 10000;
	    int myMinIntValue = Integer.MIN_VALUE;
	    int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value =" + myMinIntValue);
        System.out.println("Integer Maximum Value =" + myMaxIntValue);
        System.out.println("Busted MAX Value = " + (myMaxIntValue + 1));
        System.out.println("Busted MIN Value = " + (myMinIntValue -1));

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println(" Byte MIN Value= " + myMinByteValue);
        System.out.println(" Byte MAX Value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println(" Short MIN Value= " + myMinShortValue);
        System.out.println(" Short MAX Value = " + myMaxShortValue);


                long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println(" Long MIN Value= " + myMinLongValue);
        System.out.println(" Long MAX Value = " + myMaxLongValue);

        long bigLongLiteralValue = 2147483647234L;
        System.out.println(bigLongLiteralValue);
        short bigShortLiteralValue = 32767;
        int myTotal = (myMinIntValue/2);
        byte myNewByteValue = (byte)(myMinByteValue/2); // casting
        short myNewShortValue = (short)(myMinShortValue/2);



                //Coding challenge

        byte myByteVariable = 60;
        short myShortVariable = 300;
        int myIntVariable = 150;

        long myLongVariable = (50000 + (myByteVariable* +myShortVariable + myIntVariable)*10);
        System.out.println(myLongVariable);
        short shortTotal =(short)(1000 + 10* (myByteVariable* +myShortVariable + myIntVariable));
        System.out.println(shortTotal);
    }
}
