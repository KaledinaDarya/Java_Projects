package by.academy.java.game;

public class Vampire extends Enemy{

    protected int damage = 10;
    protected String name = "Вампир";

    public Vampire(int health) {
        super(health);
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void attackHero(Hero hero) {
        System.out.println("Вампир атакует героя.");
        hero.takeDamage(damage);
        if (!hero.isAlive()){
            System.out.println("Герой повержен!");
        } else {
            this.health += damage;
        }
    }
}
