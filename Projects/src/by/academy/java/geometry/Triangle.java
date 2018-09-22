package by.academy.java.geometry;

public class Triangle extends Figure implements BaseMethods{  //Треугольник

    protected Double base;

    public Triangle(double height, double base){
        super(height);
        this.base = base;
    }

    @Override
    public Double getArea() {
        this.area = this.height * this.base / 2;
        return this.area;
    }
}
