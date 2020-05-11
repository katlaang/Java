package com.company;

public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String colour;
// make an access modifier
    public void setModel(String model){ // accessing a variable using a method than accessing it directly
        String validModel= model.toLowerCase(); //validating the setmodel values
        if (validModel.equals("carrera") || validModel.equals("commodore")) {
            this.model = model;
        }else this.model = "unknown";
    }
    public String getModel(){
        return this.model;
    }
}
