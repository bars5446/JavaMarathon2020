package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
        }

        int max = 0;
        int min = 1000;
        int end_0 = 0;
        int end_0_Sum = 0;

        for (int n : array) {
            if (n > max) {
                max = n;
            }
            if (min > n) {
                min = n;
            }
            if (n % 10 == 0) {
                end_0++;
                end_0_Sum =+ n;
            }
        }

        System.out.println("Наибольший элемент масива: " + max);
        System.out.println("Наименьший элемент масива: " + min);
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + end_0);
        System.out.println("Сумма элементов массива, оканчивающихся на 0: " + end_0_Sum);
    }
}
