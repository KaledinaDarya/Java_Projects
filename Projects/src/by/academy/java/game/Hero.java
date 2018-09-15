package by.academy.java.game;

public abstract class Hero implements Mortal{

    protected String name;
    protected int health;

    public Hero(String name, int health) {
        super();
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return this.name;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(Enemy enemy) {
        int points;
        if (enemy instanceof Zombie) {
            points = 100;
        } else if (enemy instanceof Vampire) {
            points = 50;
        } else {
            points = 25;
        }
        this.health += points;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
    }

    @Override
    public boolean isAlive() {
        if (this.health > 0){
            return true;
        }else {
            return false;
        }
    }

    public abstract void attackEnemy(Enemy enemy);

    public abstract String getStatus();
}
