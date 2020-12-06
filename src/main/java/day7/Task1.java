package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane_1 = new Airplane("Boeing 777-200", 2014, 64, 260 );
        Airplane airplane_2 = new Airplane("Boeing 777-400", 2014, 70, 280 );
        Airplane.compareAirplanes(airplane_1, airplane_2);
    }
}