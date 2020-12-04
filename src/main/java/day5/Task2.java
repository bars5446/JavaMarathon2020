package day5;

public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike(2020, "Синий", "Yamaha Tracer 700");

        System.out.println("Год выпуска: " + motorbike.getYearOfManufacture());
        System.out.println("Цвет: " + motorbike.getColor());
        System.out.println("Модель: " + motorbike.getModel());
    }
}
