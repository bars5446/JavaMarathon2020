package day11.task2;

public class Warrior extends Hero implements PhysAttack {
    public Warrior(int health, int physDef, int magicDef, int physAtt, int magicAtt) {
        super(health, physDef, magicDef, physAtt, magicAtt);
    }

    @Override
    public void physicalAttack(Hero hero) {
        hero.setHealth(hero.getHealth() - (getPhysAtt() - (getPhysAtt() * hero.getPhysDef() / 100)));
        System.out.println(hero.toString());
    }

    @Override
    public String toString() {
        return "Warrior health - " + getHealth();
    }
}
