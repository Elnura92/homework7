package com.company;

public class Medic extends Hero {
    private int healPoints;

    public Medic(int health, int damage, SuperAbility superAbility, int healPoints) {
        super(health, damage, superAbility);
        this.healPoints = healPoints;
    }

    @Override
    public void applySuperAbility(Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (this != heroes[i] && heroes[i].getHealth() > 0) {
                heroes[i].setHealth(heroes[i].getHealth() + healPoints);
                System.out.println("Medic вылечил игрока на " + healPoints);

            }
        }


    }
}


