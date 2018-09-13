package by.academy.java.calculator;

import java.math.BigDecimal;
import java.util.Scanner;

public class CalculatorTask {

    public static void main(String[] args) {

        BigDecimal bdFirstNumber, bdSecondNumber, bdResult;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите тип данных, с которыми хотите произвести вычисления: " +
                "\n 0 - целые" +
                "\n любой другой символ - вещественные");
        int typeOfNumberId = in.nextByte();
        switch (typeOfNumberId) {
            case 0:
                System.out.println("Введите аргументы целого типа через enter:");
                DataType<Integer> cbInteger = new DataType<Integer>(in.nextInt(), in.nextInt());
                bdFirstNumber = new BigDecimal(cbInteger.firstNumber);
                bdSecondNumber = new BigDecimal(cbInteger.secondNumber);
                break;
            default:
                System.out.println("Введите аргументы вещественного типа через enter:");
                DataType<Double> cdDouble = new DataType<Double>(in.nextDouble(), in.nextDouble());
                bdFirstNumber = new BigDecimal(cdDouble.firstNumber);
                bdSecondNumber = new BigDecimal(cdDouble.secondNumber);
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
                        bdResult = bdFirstNumber.divide(bdSecondNumber);
                        result = bdFirstNumber + " / " + bdSecondNumber + " = " + bdResult;
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
