package by.academy.java.bank;

import java.util.Scanner;

public class BankBlock {

    private int quantityTwenty, quantityFifty, quantityHundred, balance;

    public BankBlock(int quantityTwenty, int quantityFifty, int quantityHundred) {
        super();
        this.quantityTwenty = quantityTwenty;
        this.quantityFifty = quantityFifty;
        this.quantityHundred = quantityHundred;
    }

    public void chooseAction(int actionId) {

        String result;
        switch (actionId) {
            case 1:
                result = "Баланс: " + getBalance() + " рублей";
                break;
            case 2:
                result = getDenomination();
                break;
            case 3:
                result = getMoney();
                break;
            case 4:
                result = setMoney();
                break;
            case 5:
                result = "Сессия завершена.";
                break;
            default:
                result = "Введен неверный код операции. Попробуйте снова.";
        }
        System.out.println(result);
    }

    private int getBalance() {
        this.balance = this.quantityTwenty * 20 + this.quantityFifty * 50 + this.quantityHundred * 100;
        return this.balance;
    }

    private String getDenomination() {
        return this.quantityTwenty + " * 20\n" + this.quantityFifty + " * 50\n" + this.quantityHundred + " * 100";
    }

    private String getMoney() {
        Scanner in = new Scanner(System.in);
        int sum;
        System.out.println("Пожалуйста введите сумму, которую хотите снять:");
        sum = in.nextInt();
        String result;
        getBalance();
        if ((sum <= 0) || (sum % 10 != 0)) {
            result = "Неверный формат суммы!";
        } else if (sum > this.balance) {
            result = "Извините, но запрашиваемой суммы нет в наличии.";
        } else {
            if (getSum(sum)) {
                result = "\nСессия успешно завершена.";
            } else {
                result = "Недостаточно банкнот для выдачи указанной суммы.";
            }
        }
        return result;
    }

    private String setMoney() {
        Scanner in = new Scanner(System.in);
        System.out.println("Пожалуйста введите количество купюр разного номинала, которое хотите внести:");
        System.out.print("по 20 рублей: ");
        this.quantityTwenty += in.nextInt();
        System.out.print("по 50 рублей: ");
        this.quantityFifty += in.nextInt();
        System.out.print("по 100 рублей: ");
        this.quantityHundred += in.nextInt();
        return "\nОбновленный баланс: " + getBalance() + " рублей.\nСессия успешно завершена.";
    }

    private boolean getSum(int sum) {
        boolean flag = false;
        int[] denomination = {100, 50, 20};
        int[] quantityArray = new int[denomination.length];
        int wholePart, quantity;

        for (int i = 0; i < denomination.length; i++) {
            System.out.println("i " + i);
            switch (i) {
                case 1:
                    quantity = this.quantityFifty;
                    break;
                case 2:
                    quantity = this.quantityTwenty;
                    break;
                default:
                    quantity = this.quantityHundred;
            }
            System.out.println("quantity " + quantity);
            wholePart = sum / denomination[i];
            System.out.println("wholePart " + wholePart);
            if (wholePart > quantity) {
                if (i != 2) {
                    quantityArray[i] = quantity;
                    sum -= quantity * denomination[i];
                }
            } else {
                quantityArray[i] = wholePart;
                sum -= wholePart * denomination[i];
            }
            System.out.println("sum " + sum);
            System.out.println("quantityArray " + quantityArray[i]);
        }
        if (sum == 0) {
            this.quantityHundred -= quantityArray[0];
            this.quantityFifty -= quantityArray[1];
            this.quantityTwenty -= quantityArray[2];
            getBalance();
            System.out.println("Формат выдачи:");
            for (int i = 0; i < denomination.length; i++) {
                if (quantityArray[i] != 0) {
                    System.out.print(quantityArray[i] + " * " + denomination[i] + "   ");
                }
            }
            flag = true;
        }
        return flag;
    }
}
