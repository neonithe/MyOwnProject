package se.lexicon.model;

public class Caracter {

    private String name;
    private int health;
    private int shield;
    private int weapon;

    public Caracter(String name) {
        this.name = name;
        this.health = 1000;
        this.shield = 0;
        this.weapon = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getShield() {
        return shield;
    }

    public void setShield(int shield) {
        this.shield = shield;
    }

    public int getWeapon() {
        return weapon;
    }

    public void setWeapon(int weapon) {
        this.weapon = weapon;
    }
}
