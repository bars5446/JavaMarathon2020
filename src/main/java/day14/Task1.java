package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("testSum");
        printSumDigits(file);
    }
    public static void printSumDigits(File file) {
        try {
            Scanner scanner = new Scanner(file);
            String[] numString = scanner.nextLine().split(" ");
//            System.out.println(Arrays.toString(numString));
            int[] numInt = new int[10];
//            System.out.println(Arrays.toString(numInt));
            int counter = 0;
            for (String num : numString) {
                numInt[counter++] = Integer.parseInt(num);
                if (numString.length < numInt.length) {
                    throw new ArrayIndexOutOfBoundsException();
                } else if (numString.length > numInt.length) {
                    throw new ArrayIndexOutOfBoundsException();
                }
            }
            int sum = 0;
            for (int num : numInt) {
                sum += num;
            }
            System.out.println(sum);
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Некорректный входной файл");
        }

    }
}
