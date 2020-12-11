package day11.task2;

public abstract class Hero implements PhysAttack {
    private int health = 100;
    private int physDef;
    private int magicDef;
    private int physAtt;


    public Hero(int physDef, int magicDef, int physAtt) {
        this.physDef = physDef;
        this.magicDef = magicDef;
        this.physAtt = physAtt;
    }

    public void setHealth(int health) {
            this.health = health;
        if (this.health <= 0) {
            this.health = 0;
        }
    }

    public int getHealth() {
        return health;
    }

    public int getPhysDef() {
        return physDef;
    }

    public int getMagicDef() {
        return magicDef;
    }

    public int getPhysAtt() {
        return physAtt;
    }

    @Override
    public void physicalAttack(Hero hero) {
        hero.setHealth(hero.getHealth() - (getPhysAtt() - (getPhysAtt() * hero.getPhysDef() / 100)));
        System.out.println(hero.toString());
    }
}
