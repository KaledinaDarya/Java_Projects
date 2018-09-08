package com.lesson2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Задача 1.");
        System.out.println(assertWords());

        System.out.println("Задача 2.1");
        System.out.println(printCoastInRUBWithUseIf());
        System.out.println("Задача 2.2");
        System.out.println(printCoastInRUBWithUseSwitch());

        System.out.println("Задача 3");
        System.out.println(assertYear());

        System.out.println("Задача 4");
        System.out.println(assertData());
    }

    private static String assertWords() {

        String result;
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первую строку: ");
        String first = in.next();
        System.out.println("Введите вторую строку: ");
        String second = in.next();

        if (first.equals(second)) {
            result = "Отлично! Слова одинаковы.";
        } else if (first.equalsIgnoreCase(second)) {
            result = "Хорошо. Почти одинаковы.";
        } else if (first.length() == second.length()) {
            result = "Ну, хотя бы они одной длинны.";
        } else {
            result = "К сожалению, слова разные.";
        }
        return result;
    }

    private static String printCoastInRUBWithUseIf() {

        String result;
        Scanner in = new Scanner(System.in);

        System.out.println("Введите сумму: ");
        int sum = in.nextInt();

        if ((sum % 100 != 11) && (sum == 1)) {
            result = sum + " рубль";
        } else if (sum % 10 == 2 || sum % 10 == 3 || sum % 10 == 4) {
            result = sum + " рубля";
        } else {
            result = sum + " рублей";
        }
        return result;
    }

    private static String printCoastInRUBWithUseSwitch() {

        String result;
        Scanner in = new Scanner(System.in);

        System.out.println("Введите сумму: ");
        String sum = in.next();
        int length = sum.length();

        switch (sum.charAt(length - 1)) {
            case '2':
            case '3':
            case '4':
                result = sum + " рубля";
                break;
            case '1':
                if (length > 1) {
                    if (sum.charAt(length - 2) == '1') {
                        result = sum + " рублей";
                        break;
                    }
                }
                result = sum + " рубль";
                break;
            default:
                result = sum + " рублей";
        }
        return result;
    }

    private static String assertYear() {

        String result;
        Scanner in = new Scanner(System.in);

        System.out.println("Введите год: ");
        int year = in.nextInt();

        switch (year % 4) {
            case 0:
                result = "Високосный год";
                break;
            default:
                result = "Не високосный год";
        }
        return result;
    }

    private static String assertData() {

        byte maxDayInMonth;
        String result;
        Scanner in = new Scanner(System.in);

        System.out.println("Введите день: ");
        byte day = in.nextByte();
        System.out.println("Введите месяц (в числовом формате): ");
        byte month = in.nextByte();
        System.out.println("Введите год: ");
        int year = in.nextInt();

        switch (month) {
            case 2:
                if (year % 4 == 0) {
                    maxDayInMonth = 29;
                } else {
                    maxDayInMonth = 28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                maxDayInMonth = 30;
                break;
            default:
                maxDayInMonth = 31;
                break;
        }

        if ((day <= maxDayInMonth) && (0 < month) && (month < 13)) {
            result = "Такая дата существует";
        } else {
            result = "Такой даты не существует";
        }
        return result;
    }
}
