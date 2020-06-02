package se.lexicon.functions;

import se.lexicon.model.Caracter;

import java.util.Random;

public class Generator {

    public static int generateNewHealth(Caracter caracter){
        // This gen new health
        int newHealth = caracter.getHealth()+RandomData.health();
       return newHealth;
    }
    public static void print(Caracter caracter){

        System.out.println("Name: "+caracter.getName());
        System.out.println("Health: "+caracter.getHealth());
        System.out.println("Shield: "+caracter.getShield());
        System.out.println("Weapon: "+caracter.getWeapon());

    }
    public static int getNewShield(Caracter caracter){
        Dice d20 = Dice.D20;
        if(d20.roll() < 15){
            caracter.setShield(caracter.getShield()+RandomData.shield());
            return caracter.getShield();
        }
        return 0;
    }
    public static int getNewWeapon(Caracter caracter){
        Dice d20 = Dice.D20;
        if(d20.roll() < 16){
            caracter.setWeapon(caracter.getWeapon()+RandomData.weapon());
            return caracter.getWeapon();
        }
        return 0;
    }
    public static int getNewHealth(Caracter caracter){
        Dice d100 = Dice.D100;
        if(d100.roll() < 50){
            caracter.setHealth(caracter.getHealth()+RandomData.health());
            return caracter.getHealth();
        }
        return 0;
    }
    public static int giveHits(Caracter caracter){
        int rand = RandomData.hits(200, 10);
        int result = rand+caracter.getWeapon();

        return result;
    }
    public static int takeHits(Caracter caracter, int max){
        int rand = RandomData.hits(max, 10);
        int result = rand-caracter.getShield();

        return result;
    }
    public static Caracter newEnemy(){
        Caracter enemy = new Caracter("Enemy");
        Generator.getNewWeapon(enemy);
        Generator.getNewShield(enemy);
        Generator.getNewHealth(enemy);

        return enemy;
    }
}
