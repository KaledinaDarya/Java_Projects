package by.academy.java.geometry;

public class ShapeUtils {

    public Figure figure;

    public ShapeUtils(double radius) {
        this.figure = new Circle(radius);
        System.out.println("Ваша фигура - круг");
    }

    public ShapeUtils(double base, double leftSide, double rightSide) {
        double height = Math.sqrt(leftSide * leftSide - base * base);
        this.figure = new Triangle(height, base);
        System.out.println("Ваша фигура - треугольник");
    }

    public ShapeUtils(double bottomBase, double leftSide, double topBase, double rightSide) {
        if ((bottomBase == leftSide) && (bottomBase == topBase) && (bottomBase == rightSide)) {
            this.figure = new Square(bottomBase);
            System.out.println("Ваша фигура - квадрат");
        } else if ((bottomBase == topBase) && (leftSide == rightSide) && (bottomBase != leftSide)) {
            this.figure = new Rectangle(bottomBase, leftSide);
            System.out.println("Ваша фигура - прямоугольник");
        } else {
            double height = Math.sqrt(
                    Math.pow(leftSide, 2) - Math.pow(
                            ((Math.pow((bottomBase - topBase), 2) + Math.pow(leftSide, 2) - Math.pow(rightSide, 2)) / (
                                    2 * (bottomBase - topBase))), 2
                    )
            );
            this.figure = new Trapeze(height, bottomBase, topBase);
            System.out.println("Ваша фигура - трапеция");
        }
    }

    public Figure getFigure() {
        return this.figure;
    }
}

