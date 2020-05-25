package com.company;

public class EnhancedPlayer {
    private String name, weapon;
    private int hitPoints =100;

    public EnhancedPlayer(String name, String weapon, int hitPoints) {
        this.name = name;
        this.weapon = weapon;
        if ( hitPoints >0 && hitPoints <= 100){
            this.hitPoints = hitPoints;
        }

    }
    public void loseHealth(int damage){
        this.hitPoints = this.hitPoints -damage;
        if(this.hitPoints <= 0){
            System.out.println("Player knocked out");
            // Reduce number of lives remaining for the player
        }
    }

    public int getHealth() {
        return hitPoints;
    }
}
