package day11.task2;

public class Paladin extends Hero implements PhysAttack, Healer {

    public Paladin(int health, int physDef, int magicDef, int physAtt, int magicAtt) {
        super(health, physDef, magicDef, physAtt, magicAtt);
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
    public void physicalAttack(Hero hero) {
        hero.setHealth(hero.getHealth() - (getPhysAtt() - (getPhysAtt() * hero.getPhysDef() / 100)));
        System.out.println(hero.toString());
    }

    @Override
    public String toString() {
        return "Paladin health - " + getHealth();
    }
}
