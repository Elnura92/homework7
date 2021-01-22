package com.company;

public class Magic extends Hero{
    public Magic(int health, int damage, SuperAbility superAbility) {
        super(health, damage, superAbility);
    }


    @Override
    public void applySuperAbility(Hero[] heroes) {
        int numRandom = 0;
        for (int i = 0; i<heroes.length; i++){
            if (heroes[i].getHealth() > 0){
                numRandom =  20 +(int) (Math.random()*40);
                damage += numRandom;
                System.out.println("Magic увеличил атаку на " + numRandom);


            }
        }

    }
}
