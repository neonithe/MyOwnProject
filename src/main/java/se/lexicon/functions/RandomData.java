package se.lexicon.functions;

import java.util.Random;

public class RandomData {

    public static int shield(){
        int max = 100;
        int min = 10;
        Random rand = new Random();
        int randNr = rand.nextInt(max + 1 - min) + min;
        return randNr;
    }
    public static int weapon(){
        int max = 500;
        int min = 10;
            Random rand = new Random();
            int randNr = rand.nextInt(max + 1 -min) + min;
            return randNr;
    }
    public static int health(){
        int max = 10000;
        int min = 1000;
            Random rand = new Random();
            int randNr = rand.nextInt(max +1 - min) +min;
            return randNr;
    }
    public static int hits(int max, int min){
        Random rand = new Random();
        int randNr = rand.nextInt(max + 1 - min) + min;
        return randNr;
    }

}
