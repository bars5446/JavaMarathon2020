package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> membersGreenDay = new ArrayList<>();
        membersGreenDay.add("Билли Джо Армстронг");
        membersGreenDay.add("Майк Дёрнт");
        membersGreenDay.add("Тре Кул");
        List<String> membersLinkinPark = new ArrayList<>();
        membersLinkinPark.add("Честер Беннингтон");
        membersLinkinPark.add("Майк Шинода");
        membersLinkinPark.add("Джо Хан");
        membersLinkinPark.add("Брэд Делсон");
        membersLinkinPark.add("Дэйв Фаррелл");
        membersLinkinPark.add("Роб Бурдон");
        membersLinkinPark.add("Марк Уэйкфилд");

        MusicBand greenDay = new MusicBand("Green Day", 1987, membersGreenDay);
        MusicBand linkinPark = new MusicBand("Linkin Park", 1996, membersLinkinPark);

        greenDay.printMembers();
        linkinPark.printMembers();

        MusicBand.transferMembers(greenDay, linkinPark);
        linkinPark.printMembers();
        greenDay.printMembers();
    }
}
