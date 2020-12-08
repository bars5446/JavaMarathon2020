package day9.Task2;

public class Triangle extends Figure {
    private double length_A;
    private double length_B;
    private double length_C;

    public Triangle(double length_A, double length_B, double length_C, String color) {
        super(color);
        this.length_A = length_A;
        this.length_B = length_B;
        this.length_C = length_C;
    }

    @Override
    public double area() {
        double p = (length_A + length_B + length_C) / 2;
        return Math.sqrt(p * (p - length_A) * (p - length_B) * (p - length_C));
    }

    @Override
    public double perimeter() {
        return length_A + length_B + length_C;
    }
}
