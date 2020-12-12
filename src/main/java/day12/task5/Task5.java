package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> membersGreenDay = new ArrayList<>();
        membersGreenDay.add(new MusicArtist("Билли Джо Армстронг", 48));
        membersGreenDay.add(new MusicArtist("Майк Дёрнт", 49));
        membersGreenDay.add(new MusicArtist("Тре Кул", 48));
        List<MusicArtist> membersLinkinPark = new ArrayList<>();
        membersLinkinPark.add(new MusicArtist("Честер Беннингтон", 41));
        membersLinkinPark.add(new MusicArtist("Майк Шинода", 43));
        membersLinkinPark.add(new MusicArtist("Джо Хан", 43));
        membersLinkinPark.add(new MusicArtist("Брэд Делсон", 43));
        membersLinkinPark.add(new MusicArtist("Дэйв Фаррелл", 43));
        membersLinkinPark.add(new MusicArtist("Роб Бурдон", 41));

        MusicBand greenDay = new MusicBand("Green Day", 1987, membersGreenDay);
        MusicBand linkinPark = new MusicBand("Linkin Park", 1996, membersLinkinPark);

        greenDay.printMembers();
        linkinPark.printMembers();
        linkinPark.deleteGroupMember(0);

        MusicBand.transferMembers(greenDay, linkinPark);
        linkinPark.printMembers();
        greenDay.printMembers();
    }
}
