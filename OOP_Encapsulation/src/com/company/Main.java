package com.company;

public class Main {

    public static void main(String[] args) {
       /* Player player = new Player();
        //we have not used a constructor so we have to fill the values manually
        player.name = "Teemu";
        player.health = 20;
        player.weapon = "Sword";
        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        damage = 11;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());
*/

     EnhancedPlayer player = new EnhancedPlayer("Teemu", "Sword", 200);
        System.out.println("Initial health is " + player.getHealth());
    }
}
