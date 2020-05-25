package com.company;

public class Player { // method not using encapsulation
    public String name,  weapon;
    public int health;

    public void loseHealth(int damage){
        this.health= this.health -damage;
        if(this.health <= 0){
            System.out.println("Player knocked out");
            // Reduce number of lives remaining for the player
        }
    }
    public int healthRemaining(){
        return this.health;
    }
}
