package by.academy.java.game;

public class Warrior extends Hero {

    protected int damage = 15;
    protected String status = "Воин";

    public Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Воин " + this.name + " атакует врага.");
        enemy.takeDamage(damage);
    }

    @Override
    public String getStatus() {
        return this.status;
    }
}
