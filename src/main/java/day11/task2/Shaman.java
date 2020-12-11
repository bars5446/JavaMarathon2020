package day11.task2;

public class Shaman extends Hero implements MagicAttack, Healer {
    private int magicAtt = 15;

    public Shaman() {
        super(20, 20, 10);
    }

    @Override
    public void healHimself() {
        setHealth(getHealth() + 50);
        System.out.println(toString());
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.setHealth(hero.getHealth() + 30);
        System.out.println(hero.toString());
    }

    @Override
    public void magicalAttack(Hero hero) {
        hero.setHealth(hero.getHealth() - (magicAtt - (magicAtt * hero.getMagicDef() / 100)));
        System.out.println(hero.toString());
    }

    @Override
    public String toString() {
        return "Shaman health - " + getHealth();
    }
}
