package by.academy.java.game;

import java.util.Random;

public abstract class Enemy implements Mortal {

    protected int health;

    public Enemy(int health) {
        super();
        this.health = health;
    }

    public int getHealth() {
        return this.health;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
    }

    public void setHealth(int addValue){
        this.health += addValue;
    }

    public boolean isAlive() {
        if (this.health > 0) {
            return true;
        } else {
            return false;
        }
    }

    public abstract void attackHero(Hero hero);

    public abstract String getName();
}
