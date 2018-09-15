package by.academy.java.game;

public class Mage extends Hero{

    protected int damage = 50;
    protected String status = "Маг";

    public Mage(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Маг " + this.name + " атакует врага.");
        enemy.takeDamage(damage);
    }

    @Override
    public String getStatus() {
        return this.status;
    }
}
