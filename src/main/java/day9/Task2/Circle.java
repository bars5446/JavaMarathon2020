package day9.Task2;

public class Circle extends Figure {
    private double circleRad;

    public Circle(double circleRad, String color) {
        super(color);
        this.circleRad = circleRad;
    }

    public double getCircleRad() {
        return circleRad;
    }

    @Override
    public double area() {
        return Math.PI * (Math.pow(circleRad, 2));
    }

    @Override
    public double perimeter() {
        return Math.PI * 2 * circleRad;
    }
}
