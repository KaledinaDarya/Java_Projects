package by.academy.java.geometry;

public class Rectangle extends Quadrangle {  // Прямоугольник

    protected Double length;

    public Rectangle(double height, double length) {
        super(height);
        this.length = length;
    }

    @Override
    public Double getArea() {
        this.area = this.height * this.length;
        return this.area;
    }
}
