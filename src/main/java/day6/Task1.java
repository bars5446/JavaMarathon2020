package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYear(2015);
        car.setColor("Серый");
        car.setModel("УАЗ-452");
        System.out.println("Модель: " + car.getModel());
        System.out.println("Год выпуска: " + car.getYear());
        System.out.println("Цвет: " + car.getColor());
        System.out.println("Возраст автомобиля: " + car.yearDifference(2020));
        car.info();
        System.out.println();

        Motorbike motorbike = new Motorbike("Yamaha Tracer 700", "Синий", 2013);
        System.out.println("Год выпуска: " + motorbike.getYearOfManufacture());
        System.out.println("Цвет: " + motorbike.getColor());
        System.out.println("Модель: " + motorbike.getModel());
        System.out.println("Возраст мотоцикла: " + motorbike.yearDifference(2020));
        motorbike.info();
    }
}
