package by.academy.java.geometry;

public class Figure implements BaseMethods {

    protected Double height;
    protected Double area;

    public Figure(double height) {
        this.height = height;
    }

    @Override
    public Double getArea() {
        return area;
    }

    @Override
    public void isEqual(Double figureArea) {
        System.out.println("Площадь предыдущей фигуры равна: " + figureArea);
        System.out.println("Площадь нынешней фигуры равна: " + this.getArea());
        if (figureArea.equals(this.getArea())) {
            System.out.println("Фигуры равны по площади.");
        } else {
            System.out.println("Площадь фигур не совпадает.");
        }
    }

    @Override
    public String toString() {
        return this.getArea().toString();
    }
}
