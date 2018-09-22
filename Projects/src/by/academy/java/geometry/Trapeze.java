package by.academy.java.geometry;

public class Trapeze extends Quadrangle {  // Трапеция

    protected Double bottomBase;
    protected Double topBase;

    public Trapeze(double height, double bottomBase, double topBase) {
        super(height);
        this.bottomBase = bottomBase;
        this.topBase = topBase;
    }

    @Override
    public Double getArea() {
        this.area = (bottomBase + topBase) * this.height / 2;
        return this.area;
    }
}
