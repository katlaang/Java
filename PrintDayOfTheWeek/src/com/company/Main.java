package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(isLeapYear(0));
        System.out.println(getDaysInMonth(2, 0));

    }
    public static void printDayOfTheWeek(int day){
        switch (day){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid Day");

        }
    }

    public static boolean isLeapYear(int year){
        if((year >= 1 && year <= 9999) && (year%4 ==0 && year%100 !=0 || year%400 ==0)){
            return true;
        }return false;

    }
    public static int getDaysInMonth (int month, int year){
        if ((month <1 || month >12) || (year <1 || year > 9999)){
            return -1;
        }

        boolean isLeap= isLeapYear(year);
        int days;
        switch (month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                days =31;
                break;
            case 2:
                days =28;
                if (isLeap ==true){
                    days = days +1;
                }
                break;
            case 4: case 6: case 9: case 11:
                days =30;
                break;
            default:
                return  -1;
        }
        return days;
    }
}

