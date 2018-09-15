package by.academy.java.game;

public class Archer extends Hero{

    protected int damage = 20;
    protected String status = "Лучник";

    public Archer(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Лучник " + this.name + " атакует врага.");
        enemy.takeDamage(damage);
        if (enemy.isAlive()) {
            enemy.takeDamage(damage / 2);
        }
    }

    @Override
    public String getStatus() {
        return this.status;
    }
}
