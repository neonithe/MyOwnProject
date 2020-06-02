package se.lexicon.functions;

import java.util.concurrent.ThreadLocalRandom;

//Dice with values D6, D10, D20 and D100
//Add a field for each value representing the maxValue for each roll. You also need to create a constructor.
//Make a method called roll that returns a random number between 1 and the maxValue.
public enum Dice {
    D6(6),
    D10(10),
    D20(20),
    D100(100);

    private final int maxValue;

    Dice(int maxValue){
        this.maxValue = maxValue;
    }

    public int roll(){
        return ThreadLocalRandom.current().nextInt(1, (maxValue + 1));
    }
}
