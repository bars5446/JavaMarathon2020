package day11.task2;

public class Shaman extends Hero implements PhysAttack, MagicAttack, Healer {

    public Shaman(int health, int physDef, int magicDef, int physAtt, int magicAtt) {
        super(health, physDef, magicDef, physAtt, magicAtt);
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
        hero.setHealth(hero.getHealth() - (getMagicAtt() - (getMagicAtt() * hero.getMagicDef() / 100)));
        System.out.println(hero.toString());
    }

    @Override
    public void physicalAttack(Hero hero) {
        hero.setHealth(hero.getHealth() - (getPhysAtt() - (getPhysAtt() * hero.getPhysDef() / 100)));
        System.out.println(hero.toString());
    }

    @Override
    public String toString() {
        return "Shaman health - " + getHealth();
    }
}
