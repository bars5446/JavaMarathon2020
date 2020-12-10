package day11.task2;

public abstract class Hero {
    private int health;
    private int physDef;
    private int magicDef;
    private int physAtt;
    private int magicAtt;

    public Hero(int health, int physDef, int magicDef, int physAtt, int magicAtt) {
        this.health = health;
        this.physDef = physDef;
        this.magicDef = magicDef;
        this.physAtt = physAtt;
        this.magicAtt = magicAtt;
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

    public int getMagicAtt() {
        return magicAtt;
    }
}
