package com.lesson3;

import java.util.Random;
import java.util.RandomAccess;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Задача 1:");
        int[] oneArray = getOneDimensionalArray();
        printOneDimensionalArray(oneArray);
        System.out.println("\nМассив в обратном порядке:");
        for (int i = oneArray.length; i > 0; i--){
            System.out.print(oneArray[i - 1]);
        }

        System.out.println("\nЗадача 2:");
        int[] naturalArray = new int[100];
        int number = 1;
        for (int i = 0; i < naturalArray.length; i++){
            while ((number % 13 != 0) && (number % 17 != 0)) {
                number++;
            }
            naturalArray[i] = number;
            number++;
        }
        printOneDimensionalArray(naturalArray);

        System.out.println("\nЗадача 3:");
        int[] sumElements = getOneDimensionalArray();
        System.out.println(sumBetweenMinAndMax(sumElements));

        System.out.println("\nЗадача 4:");
        Random rnd = new Random();
        int[] randomArray;
        randomArray = new int[4];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = rnd.nextInt();
        }
        printOneDimensionalArray(randomArray);

    }

    private static void assertSequence(int[] array) {

        String result = "Возрастающая последовательность";

        if (array.length > 1) {
            int i = 1;
            while (array[i - 1] < array[i]){
                result = "Возрастающая последовательность";
                i++;
            }
        }
        while ()
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] < array[i]) {
                result = "Возрастающая последовательность";
            } else {

            }
        }
        if (result)
    }

    private static int sumBetweenMinAndMax(int[] array) {
        int sum = 0;
        int minValue = 0;
        int minIndex = 0;
        int maxValue = 0;
        int maxIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minIndex = i;
            }
            if (array[i] > maxValue) {
                maxValue = array[i];
                maxIndex = i;
            }
        }

        for (int i = minIndex + 1; i < maxIndex; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

    private static int[] getOneDimensionalArray() {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите размерность массива:");
        int length = in.nextInt();
        int[] array = new int[length];

        System.out.println("Через enter введите все элементы массива:");
        for (int i = 0; i < length; i++){
            array[i] = in.nextInt();
        }
        return array;
    }

    private static int[][] getMultiDimensionalArray() {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите длинну массива:");
        int length = in.nextInt();
        System.out.println("Введите высоту массива:");
        int height = in.nextInt();

        int[][] array = new int[length][height];

        System.out.println("Через enter введите все элементы массива:");
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                array[i][j] = in.nextInt();
            }
            System.out.print('\n');
        }
        return array;
    }

    private static void printOneDimensionalArray(int[] array) {

        for (int i = 0; i < array.length; i++){
            if (i != 0) {
                System.out.print(",");
            }
            System.out.print(array[i]);
        }
    }

    private static void printMultiDimensionalArray(int[][] array) {

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                if (j != 0) {
                    System.out.print(",");
                }
                System.out.print(array[i][j]);
            }
            System.out.print('\n');
        }
    }
}
