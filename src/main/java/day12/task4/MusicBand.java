package day12.task4;

import java.util.*;

public class MusicBand {
    private String name;
    private int year;
    private List<String> members;

    public MusicBand(String name, int year, List<String> members) {
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

    public List<String> getMembers() {
        return members;
    }

    @Override
    public String toString() {
        return name + " - " + year;
    }

    public void addGroupMember(String member) {
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
