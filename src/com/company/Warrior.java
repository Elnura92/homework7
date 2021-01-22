package com.company;


public class Warrior extends Hero {
    public Warrior(int health, int damage, SuperAbility superAbility) {
        super(health, damage, superAbility);
    }




    @Override

    public void applySuperAbility(Hero[] heroes) {

        int numRandom = 0;

        for (int i= 0; i< heroes.length; i++){
            if (heroes[i].getHealth() > 0)

                numRandom = 2 + (int)(Math.random() *2) +1;
                damage *= numRandom;
                System.out.println("Warrior  критует в " + numRandom + " раза");
        }


    }
}
