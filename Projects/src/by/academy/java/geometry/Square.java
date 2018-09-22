package by.academy.java.geometry;

public class Square extends Quadrangle {  // Квадрат

    public Square(double height) {
        super(height);
    }

    @Override
    public Double getArea() {
        this.area = Math.pow(this.height, 2);
        return this.area;
    }
}
