package com.company;

public class Main {

    public static void main(String[] args) {

    }

    public static double calcFeetAndInchesToCentimetres(double feet, double inches){
        if ((feet < 0) || (inches <0 || inches>12)){
            return -1;
        }

        inches = (feet *12);
        double centimetres = (inches *2.54);
        return centimetres;





    }
    public static double calcFeetAndInchesToCentimetres(double inches){
        if (inches < 0){
            return -1;

        }
        double feet = inches/12;


    }
}
