package com.company;

public class Floor {
  private  double width, length;

    public Floor(double width, double length) {
        this.width = width<0 ? 0:width;
        this.length = length < 0? 0: length;
    }
    public double getArea(){
        return width*length;
    }
}


   class Carpet {
    private double cost;

    public Carpet(double cost) {
        this.cost = cost <0 ?0:cost;
    }

    public double getCost() {
        return this.cost;
    }

   }

class Calculator {
    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }


    public double getTotalCost() {
        return this.floor.getArea() * this.carpet.getCost();
    }

}

