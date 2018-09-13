package by.academy.java.bank;

import java.util.Scanner;

public class BankTask {

    public static void main(String[] args) {

        BankBlock bankBlock = new BankBlock(10, 10, 10);
        Scanner in = new Scanner(System.in);
        int actionId;
        do {
            System.out.println("\nВыберите действие: " +
                    "\n 1 - Посмотреть баланс" +
                    "\n 2 - Вывести количество купюр разного номинала " +
                    "\n 3 - Снять средства" +
                    "\n 4 - Внести средства " +
                    "\n 5 - Выйти");
            actionId = in.nextInt();
            bankBlock.chooseAction(actionId);
        } while (actionId != 5);
    }
}
