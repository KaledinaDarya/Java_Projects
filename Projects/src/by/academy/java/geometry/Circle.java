package by.academy.java.geometry;

public class Circle extends Figure  {  // Круг

    protected final Double PI = 3.14;

    public Circle(double radius){
        super(radius);
    }

    @Override
    public Double getArea() {
        this.area = PI * this.height * this.height;
        return this.area;
    }
}
