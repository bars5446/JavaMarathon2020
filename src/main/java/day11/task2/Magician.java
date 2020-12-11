package day11.task2;

public class Magician extends Hero implements MagicAttack {
    private int magicAtt = 20;

    public Magician() {
        super(0, 80, 5);
    }

    @Override
    public void magicalAttack(Hero hero) {
        hero.setHealth(hero.getHealth() - (magicAtt - (magicAtt * hero.getMagicDef() / 100)));
        System.out.println(hero.toString());
    }

    @Override
    public String toString() {
        return "Magician health - " + getHealth();
    }
}
