package by.academy.java.game;

import java.util.Random;
import java.util.Scanner;

public class BattleGround {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Hero hero;
        Enemy enemy;
        System.out.println("Ведите имя Героя:");
        hero = new Warrior(in.next(), 100);
        System.out.println("Ведите количество врагов в игре:");
        int quantityOfEnemy = in.nextInt();
        int round = 0;
        while ((hero.isAlive()) && (round < quantityOfEnemy)) {
            Random rdm = new Random();
            int enemyId = rdm.nextInt(5);
            switch (enemyId) {
                case 0:
                    enemy = new Zombie(50);
                    break;
                case 1:
                case 2:
                    enemy = new Vampire(25);
                    break;
                default:
                    enemy = new Werewolf(10);
            }
            while ((enemy.isAlive()) && (hero.isAlive())) {
                System.out.println(hero.getName() + " ---" + hero.getHealth() + "---");
                System.out.println(enemy.getName() + " ---" + enemy.getHealth() + "---");
                hero.attackEnemy(enemy);
                if (enemy.isAlive()) {
                    enemy.attackHero(hero);
                } else {
                    System.out.println("Враг уничтожен!");
                    hero.setHealth(enemy);
                    if ((hero.getHealth() >= 150) && (hero.getHealth() < 250) && !(hero instanceof Archer)) {
                        System.out.println(hero.getStatus() + " " + hero.getName() + " становится Лучником");
                        hero = new Archer(hero.getName(), hero.getHealth());
                    } else if ((hero.getHealth() >= 250) && !(hero instanceof Mage)) {
                        System.out.println(hero.getStatus() + " " + hero.getName() + " становится Магом");
                        hero = new Mage(hero.getName(), hero.getHealth());
                    } else if ((hero.getHealth() < 150) && !(hero instanceof Warrior)) {
                        System.out.println(hero.getStatus() + " " + hero.getName() + " становится Войном");
                        hero = new Archer(hero.getName(), hero.getHealth());
                    }
                }
            }
            round++;
        }
        System.out.println("Конец игры.");
    }
}
