package day12.task5;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> members;

    public MusicBand(String name, int year, List<MusicArtist> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public List<MusicArtist> getMembers() {
        return members;
    }

    @Override
    public String toString() {
        return name + " - " + year;
    }

    public void addGroupMember(MusicArtist member) {
        members.add(member);
    }

    public void deleteGroupMember (int indexMember) {
        members.remove(indexMember);
    }

    public void printMembers () {
        System.out.println(members.toString());
    }

    public static void transferMembers(MusicBand musicBand1goTo, MusicBand musicBand2) {
        musicBand2.getMembers().addAll(musicBand1goTo.getMembers());
        musicBand1goTo.getMembers().removeAll(musicBand1goTo.getMembers());
    }
}
