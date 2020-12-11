package day11.task2;

public class Paladin extends Hero implements Healer {

    public Paladin() {
        super(50, 20, 15);
    }

    @Override
    public void healHimself() {
        setHealth(getHealth() + 25);
        System.out.println(toString());
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.setHealth(hero.getHealth() + 10);
        System.out.println(hero.toString());
    }

    @Override
    public String toString() {
        return "Paladin health - " + getHealth();
    }
}
