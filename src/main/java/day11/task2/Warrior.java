package day11.task2;

public class Warrior extends Hero {

    public Warrior() {
        super(80, 0, 30);
    }

    @Override
    public String toString() {
        return "Warrior health - " + getHealth();
    }
}
