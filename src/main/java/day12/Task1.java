package day12;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Лада");
        list.add("Мерседес");
        list.add("Рено");
        list.add("БМВ");
        list.add("Ауди");
        System.out.println(list.toString());

        list.add(2, "Киа");
        System.out.println(list.toString());

        list.remove(0);
        System.out.println(list.toString());
    }
}
