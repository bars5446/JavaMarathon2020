package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[100000];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }

        int index = 0;
        int sumMax = 0;

        for (int i = 0; i < array.length - 49; i++){
            int sumLine = 0;
            for (int j = i; j < i + 50; j++ ){
                sumLine += array[j];
            }
            if (sumLine > sumMax) {
                sumMax = sumLine;
                index = i;
            }

        }

        System.out.println("Сумма тройки: " + sumMax);
        System.out.println("Индекс первого элемента тройки: " + index);
    }
}
