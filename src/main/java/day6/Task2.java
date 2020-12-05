package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeing 777-200", 2014, 64, 260 );
        airplane.info();
        airplane.setYear(2016);
        airplane.setLength(60);
        airplane.fillUp(20);
        airplane.fillUp(15);
        airplane.info();
    }
}
