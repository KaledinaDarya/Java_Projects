package by.academy.java.game;

public class Werewolf extends Enemy{

    protected int damage = 10;
    protected String name = "Оборотень";

    public Werewolf(int health) {
        super(health);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void attackHero(Hero hero) {
        System.out.println("Оборотень атакует героя.");
        hero.takeDamage(damage);
        if (!hero.isAlive()){
            System.out.println("Герой повержен!");
        }
    }
}
