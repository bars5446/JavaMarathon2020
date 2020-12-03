package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }

        int index = 0;
        int sum = 0;
        for (int i = 0; i < array.length - 2; i++){
            int a = array[i] + array[i + 1] + array [i + 2];
            if (a > sum) {
                sum = a;
                index = i;
            }
        }
        System.out.println("Сумма тройки: " + sum);
        System.out.println("Индекс первого элемента тройки: " + index);
    }
}
