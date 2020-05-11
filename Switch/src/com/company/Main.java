package com.company;

public class Main {

    public static void main(String[] args) {
	int switchValue =1;
	switch (switchValue) {
        case 1:
            System.out.println("The value was 1");
            break;
        case 2:
            System.out.println("Value was 2");
            break;
        case 3: case 4: case 5:
            System.out.println("Was 3 or 4 or 5");
            System.out.println("Actually it was a " + switchValue);
            break;
        default:
            System.out.println("Was not 1 or 2");
            break;
    }

    //Coding challenge
        char charValue = 'A';
	switch(charValue){
        case 'A':
            System.out.println("A was found");
            break;
        case 'B':
            System.out.println("B was found");
            break;
        case 'C': case 'D': case 'E':
            System.out.println(charValue + " was found.");
            break;
        default:
            System.out.println("Could not find A,B,C,D or E.");
    }
    String month = "January";
	switch (month.toLowerCase()){ // toLowerCase converts the string to lowercase and then does the search
        case "january":
            System.out.println("Jan");
            break;
        case "june":
            System.out.println("Jun");
            break;
        default:
            System.out.println("Not Sure");
            break;
    }

    }
}