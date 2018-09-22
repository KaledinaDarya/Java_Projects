package by.academy.java.calculator;

import java.math.BigDecimal;
import java.util.Scanner;

public class CalculatorTask {

    public static void main(String[] args) {

        BigDecimal bdFirstNumber, bdSecondNumber, bdResult;
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите тип первого числа: " +
                "\n 0 - целые" +
                "\n 1 - вещественные");
        int typeOfFirstNumberId = in.nextByte();
        System.out.println("Выберите тип второго числа: " +
                "\n 0 - целые" +
                "\n 1 - вещественные");
        int typeOfSecondNumberId = in.nextByte();
        System.out.println("Через enter введите оба числа: ");
        if ((typeOfFirstNumberId == 0) && (typeOfSecondNumberId == 0)) {
            ClassForGenerics<Integer, Integer> generics = new ClassForGenerics<>(in.nextInt(), in.nextInt());
            bdFirstNumber = new BigDecimal(generics.getFirstNumber());
            bdSecondNumber = new BigDecimal(generics.getSecondNumber());
        } else if ((typeOfFirstNumberId == 1) && (typeOfSecondNumberId == 0)) {
            ClassForGenerics<Double, Integer> generics = new ClassForGenerics<>(in.nextDouble(), in.nextInt());
            bdFirstNumber = new BigDecimal(generics.getFirstNumber());
            bdSecondNumber = new BigDecimal(generics.getSecondNumber());
        } else if ((typeOfFirstNumberId == 0) && (typeOfSecondNumberId == 1)) {
            ClassForGenerics<Integer, Double> generics = new ClassForGenerics<>(in.nextInt(), in.nextDouble());
            bdFirstNumber = new BigDecimal(generics.getFirstNumber());
            bdSecondNumber = new BigDecimal(generics.getSecondNumber());
        } else {
            ClassForGenerics<Double, Double> generics = new ClassForGenerics<>(in.nextDouble(), in.nextDouble());
            bdFirstNumber = new BigDecimal(generics.getFirstNumber());
            bdSecondNumber = new BigDecimal(generics.getSecondNumber());
        }
        int actionId = 0;
        do {
            System.out.println("Выберите операцию: " +
                    "\n 1 - сложение" +
                    "\n 2 - вычитание" +
                    "\n 3 - умножение" +
                    "\n 4 - деление" +
                    "\n 5 - выход");
            actionId = in.nextByte();
            String result;
            switch (actionId) {
                case 1:
                    bdResult = bdFirstNumber.add(bdSecondNumber);
                    result = bdFirstNumber + " + " + bdSecondNumber + " = " + bdResult;
                    break;
                case 2:
                    bdResult = bdFirstNumber.subtract(bdSecondNumber);
                    result = bdFirstNumber + " - " + bdSecondNumber + " = " + bdResult;
                    break;
                case 3:
                    bdResult = bdFirstNumber.multiply(bdSecondNumber);
                    result = bdFirstNumber + " * " + bdSecondNumber + " = " + bdResult;
                    break;
                case 4:
                    if (!bdSecondNumber.equals(BigDecimal.ZERO)) {
                        bdResult = bdFirstNumber.divide(bdSecondNumber, BigDecimal.ROUND_CEILING);
                        result = bdFirstNumber + " / " + bdSecondNumber + " " +
                                "(с окргулением в сторону большего целого) = " + bdResult;
                        break;
                    } else {
                        result = "Ошибка! Деление на ноль.";
                        break;
                    }
                case 5:
                    result = "Вычисления завершены.";
                    break;
                default:
                    result = "Некорректное значение операции. Попробуйте снова.";
            }
            System.out.println(result);
        } while (actionId != 5);
    }
}
