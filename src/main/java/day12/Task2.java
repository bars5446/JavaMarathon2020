package day12;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<>();


        for (int i = 0; i < 350; i++) {
            if ((i < 30 || i > 300) & i % 2 == 0 && i != 0) {
                numList.add(i);
            }
        }
        System.out.println(numList.toString());
    }
}
