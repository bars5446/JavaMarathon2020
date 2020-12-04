package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();

        car.setYearOfManufacture(2020);
        car.setColor("Серый");
        car.setModel("УАЗ-452");
        System.out.println("Модель: " + car.getModel());
        System.out.println("Год выпуска: " + car.getYearOfManufacture());
        System.out.println("Цвет: " + car.getColor());

    }
}
