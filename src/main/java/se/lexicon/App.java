package se.lexicon;

import se.lexicon.functions.Dice;
import se.lexicon.functions.Generator;
import se.lexicon.functions.RandomData;
import se.lexicon.model.Caracter;

import java.util.Random;

/**
 * A little game
 *  Should contain weponds, health, hits,
 */
public class App 
{
    public static void main( String[] args )
    {
        /** Create Caracter **/
        Caracter caracter = new Caracter("Mattias");
        /** Set New Health **/
        caracter.setHealth(Generator.generateNewHealth(caracter));
        /** Generate New Equipment **/
        Generator.getNewWeapon(caracter);
        Generator.getNewHealth(caracter);
        Generator.getNewShield(caracter);
        /** **/
        System.out.println(Generator.giveHits(caracter));


        /** Give Hit **/
        System.out.println(Generator.giveHits(caracter));
        caracter.setShield(10);
        System.out.println(Generator.takeHits(caracter, 100));


        /** Print person **/
        Generator.print(caracter);
        Caracter enemy = Generator.newEnemy();
        Generator.print(enemy);

    }

    public static int rollDice(){
        Dice d6 =Dice.D6;
        return d6.roll();
    }



}
