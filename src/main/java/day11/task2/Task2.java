package day11.task2;

public class Task2 {
    public static void main(String[] args) {
        Warrior warrior = new Warrior(100,80, 0, 30, 0);
        Paladin paladin = new Paladin(100, 50, 20, 15, 0);

//        warrior.physicalAttack(paladin);
//        paladin.physicalAttack(warrior);
//        System.out.println(paladin.getHealth());
//        System.out.println(warrior.getHealth());

        Magician magician = new Magician(100, 0, 80, 5, 20);
        Shaman shaman = new Shaman(100, 20, 20, 10, 15);

//        magician.magicalAttack(shaman);
//        shaman.magicalAttack(magician);
//        System.out.println(magician.getHealth());
//        System.out.println(shaman.getHealth());
//
//        paladin.healHimself();
//        System.out.println(paladin.getHealth());
        warrior.physicalAttack(paladin);
        paladin.physicalAttack(magician);
        shaman.healTeammate(magician);
        magician.magicalAttack(paladin);
        shaman.physicalAttack(warrior);
        paladin.healHimself();
        System.out.println();
        for (int i = 0; i < 5; i++) {
            warrior.physicalAttack(magician);
        }

    }
}
