package com.lesson2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Задача 1: ");
        formattingData();
//        System.out.println("Задача 2: ");
//        System.out.println("Задача 3: ");
    }

    private static void formattingData() {

        byte maxDayInMonth;
        Scanner in = new Scanner(System.in);

        System.out.println("Введите день: ");
        byte day = in.nextByte();
        System.out.println("Введите месяц (в числовом формате): ");
        byte month = in.nextByte();
        System.out.println("Введите год: ");
        int year = in.nextInt();

        day++;

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

        System.out.println(maxDayInMonth);

        if (day > maxDayInMonth) {
            month++;
            day = 1;
        }

        if (month > 12) {
            year++;
            month = 1;
        }

        System.out.println(day + "." + month + "." + year);
    }
}
