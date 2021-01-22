package com.company;


import java.util.Random;

public class Main {


    public static void main(String[] args)  {
        Warrior warrior = new Warrior(500, 25,SuperAbility.CRITICAL_DAMAGE);
        Medic medic = new Medic(620, 70,  SuperAbility.HEAL, 150);
        Magic magic = new Magic(450, 45,SuperAbility.BOOST);
        Hero[] heroes = {warrior, magic, medic};


        for (int i = 0; i< heroes.length; i++){
            heroes[i].applySuperAbility(heroes);


        }





    }




    }