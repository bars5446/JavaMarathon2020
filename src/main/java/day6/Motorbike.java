package day6;

public class Motorbike {
    private final String model;
    private final String color;
    private final int yearOfManufacture;

    public Motorbike(String model, String color, int yearOfManufacture) {
        this.model = model;
        this.color = color;
        this.yearOfManufacture = yearOfManufacture;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public void info() {
        System.out.println("Это мотоцикл");
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
