package by.academy.java.game;

public class Zombie extends Enemy {

    protected int damage = 20;
    protected String name = "Зомби";
    protected boolean flagRevive = false;

    public Zombie(int health) {
        super(health);
    }

    public String getName() {
        return this.name;
    }

    @Override
    public boolean isAlive() {
        if(this.health > 0) {
            return true;
        } else {
            if (flagRevive) {
                flagRevive = false;
                return false;
            } else {
                flagRevive = true;
                this.health += 50;
                System.out.println("Зомби воскрес!");
                return true;
            }
        }
    }

    @Override
    public void attackHero(Hero hero) {
        System.out.println("Зомби атакует героя.");
        hero.takeDamage(damage);
        if (!hero.isAlive()){
            System.out.println("Герой повержен!");
        }
    }
}
