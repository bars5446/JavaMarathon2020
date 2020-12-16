package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("testSum");
        printResult(file);
    }
    public static void printResult(File file) {
        try {
            Scanner scanner1 = new Scanner(file);
            while (scanner1.hasNextLine()) {
                String[] numString = scanner1.nextLine().split(" ");
                double arithmeticMean = 0;
                double i = 0;
                for (String num : numString) {
                    arithmeticMean += Double.parseDouble(num);
                    i++;
                }
                arithmeticMean /= i;
                System.out.print(arithmeticMean + " --> " + String.format("%.3f",arithmeticMean));
            }
            scanner1.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

    }
}

