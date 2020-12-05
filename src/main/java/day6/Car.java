package day6;

public class Car {
    private int yearOfManufacture;
    private String color;
    private String model;

    public void setYear(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return yearOfManufacture;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public void info() {
        System.out.println("Это автомобиль");
    }

    public int yearDifference(int year) {
        int yearDiff;
        if (year > yearOfManufacture) {
            yearDiff = year - yearOfManufacture;
        } else {
            yearDiff = yearOfManufacture - year;
        }
        return yearDiff;
    }
}
