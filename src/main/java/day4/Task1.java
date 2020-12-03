package day4;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int input = scanner.nextInt();
        scanner.close();

        int[] array = new int[input];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(array));

        int numOver_8= 0;
        int numEqual_1 = 0;
        int numEven = 0;
        int numNotEven = 0;
        int sumNumArray = 0;

        for (int n : array) {
            if(n > 8){
                numOver_8++;
            }
            if(n == 1){
                numEqual_1++;
            }
            if(n % 2 == 0){
                numEven++;
            }
            if(n % 2 != 0){
                numNotEven++;
            }
            sumNumArray += array[n];
        }
        System.out.println();
        System.out.println("Информация о массиве:");
        System.out.println("Длина массива: " + array.length);
        System.out.println("Количество чисел больше 8: " + numOver_8);
        System.out.println("Количество чисел равных 1: " + numEqual_1);
        System.out.println("Количество четных чисел: " + numEven);
        System.out.println("Количество нечетных чисел: " + numNotEven);
        System.out.println("Сумма всех элементов массива: " + sumNumArray);
    }
}
