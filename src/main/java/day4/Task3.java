package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[][] matr = new int[12][8];
        Random random = new Random();

        for (int i = 0; i < matr.length; i++){
            for (int j = 0; j < matr[i].length; j++) {
                matr[i][j] = random.nextInt(50);
                System.out.print(matr[i][j] + " ");
            }
            System.out.println();
        }

        int index = 0;
        int max = 0;
        int max2 = 0;
        for (int i = 0; i < matr.length; i++){
            for (int j = 0; j < matr[i].length; j++) {
                max += matr[i][j];
            }
            if (max >= max2) {
                max2 = max;
                index = i;
            }
            max = 0;
        }
        System.out.println("Индекс: " + index);
        System.out.println("Максимум: " + max2);
    }
}
