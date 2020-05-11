package com.company;

public class Fish extends Animal {
    private int gills, eyes, finns;

    public Fish(String name, int size, int weight, int gills, int eyes, int finns) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.finns = finns;
    }
    private void rest(){

    }

    private void moveMuscles(){

    }
    private void moveBackFin(){

    }
    private void swim (int speed){
        moveMuscles();
        moveBackFin();
        super.move(speed);

    }

}
