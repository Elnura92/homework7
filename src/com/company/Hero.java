package com.company;

public abstract class Hero implements HavingSuperAbility {
    public int health;
    public int damage;
    public SuperAbility superAbility;

    public Hero(int health, int damage, SuperAbility superAbility) {
        this.health = health;
        this.damage = damage;
        this.superAbility = superAbility;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }


}