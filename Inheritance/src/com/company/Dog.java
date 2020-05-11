package com.company;

public class Dog extends Animal{
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog( String name, int size, int weight,int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes=eyes; //this used to call current class members. commonly used in constructors and setters and sometimes in getters
        this.legs= legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }
    private void chew(){
        System.out.println("Dog.chew called");
    }

    @Override //you can override a methgod. e.g in this case, a dog eats in a particular way.
    public void eat() {   // is used to write override methods code --> generate --> override method and choose  one method to override.
        System.out.println("Dog.eat called");
        chew(); // dog eats by chewing so we call a method that is unique to the dog class
        super.eat(); // super calls the super equivalent of that class
    }
    public void walk(){ // we are expounding the move class with more specific methods like walk and run
        System.out.println("Dog.walk() called");
        move(5);
    }
    public void run(){
        System.out.println("Dog.run() called");
        move(10);
    }
}
