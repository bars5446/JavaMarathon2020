package day12.task3;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        MusicBand greenDay = new MusicBand("Green Day", 1987);
        MusicBand coldplay = new MusicBand("Coldplay", 1996);
        MusicBand linkinPark = new MusicBand("Linkin Park", 1996);
        MusicBand arcticMonkeys = new MusicBand("Arctic Monkeys", 2002);
        MusicBand fooFighters = new MusicBand("Foo Fighters", 1994);
        MusicBand outkast = new MusicBand("Outkast", 1991);
        MusicBand fallOutBoy = new MusicBand("Fall Out Boy", 2001);
        MusicBand paramore = new MusicBand("Paramore", 2006);
        MusicBand neonTrees = new MusicBand("Neon Trees", 2008);
        MusicBand ofMonstersAndMen = new MusicBand("Of Monsters And Men", 2010);

        ArrayList<MusicBand> musicBandsList = new ArrayList<>(Arrays.asList(greenDay, coldplay, linkinPark,
                                                                            arcticMonkeys, fooFighters, outkast,
                                                                            fallOutBoy, paramore, neonTrees,
                                                                            ofMonstersAndMen));

        System.out.println(musicBandsList.toString());
        Collections.shuffle(musicBandsList);
        System.out.println(musicBandsList.toString());
        System.out.println(groupsAfter2000(musicBandsList).toString());

    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        ArrayList<MusicBand> newlist = new ArrayList<>();

        for (MusicBand musicBand : bands) {
            if (musicBand.getYear() >= 2000) {
                newlist.add(musicBand);
            }
        }
        return newlist;
    }
}
