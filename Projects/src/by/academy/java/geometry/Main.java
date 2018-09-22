package by.academy.java.geometry;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Figure figure = getSideOfFigure().getFigure();
        System.out.println("Площадь вашей фигуры равна:" + figure.toString());
        Double figureArea = figure.getArea();
        System.out.println("Параметр фигуры для сравнения:");
        figure = getSideOfFigure().getFigure();
        figure.isEqual(figureArea);
    }

    private static ShapeUtils getSideOfFigure() {
        Scanner in = new Scanner(System.in);
        System.out.println("Пожалуйста, введите стороны фигуры, а остальные параметры заполните нулями" +
                "\n(ввод начинаем с радиуса или нижнего основания и дальше по часовой стрелке):");
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        double d = in.nextDouble();
        ShapeUtils shu;
        if (d == 0) {
            if ((b == 0) && (c == 0)) {
                shu = new ShapeUtils(a);
            } else {
                if (a < (b + c)) {
                    shu = new ShapeUtils(a, b, c);
                } else {
                    System.out.println("Фигуры с такими параметрами не существует, попробуйте снова");
                    shu = getSideOfFigure();
                }
            }
        } else {
            if ((a < (b + c + d)) && (b < (a + c + d)) && (c < (a + b + d)) && (d < (a + b + c))) {
                if (a > c) {
                    shu = new ShapeUtils(a, b, c, d);
                } else {
                    shu = new ShapeUtils(c, d, a, b);
                }

            } else{
                System.out.println("Фигуры с такими параметрами не существует, попробуйте снова");
                shu = getSideOfFigure();
            }
        }
        return shu;
    }
}
