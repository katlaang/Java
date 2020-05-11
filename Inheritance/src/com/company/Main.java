package com.company;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1, 5, 5);
        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "Long silky");
        dog.eat();
//        results of running the code


//        Dog.eat called
//        Dog.chew called
//        Animal .eat called.
//        Dog.eat method has been called first.
//
//        We then use chew, which called the private method chew in the Dog class, but
//
//        then we use super.eat, which called the animal.eat class.
        dog.walk();
        dog.run();

    }
}
