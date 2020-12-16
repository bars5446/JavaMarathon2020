package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        printResult(createFile_2(createFile_1()));
    }

    public static File createFile_1() {
        Random random = new Random();
        File file_1 = new File("file1.txt");
        try {
            PrintWriter printWriter = new PrintWriter(file_1);
            // Заполняем фаил числами от 0 до 100 в размере 1000 едениц
            for (int i = 0; i < 1000; i++) {
                printWriter.print(random.nextInt(100) + " ");
            }
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file_1;
    }

    public static File createFile_2(File file_1) {
        File file_2 = new File("file2.txt");
        try {
            Scanner scanner1 = new Scanner(file_1);
            List<Double> listArithmeticMean = new ArrayList<>();
            // Считываем данные из файла
            while (scanner1.hasNextLine()) {
                String[] numString = scanner1.nextLine().split(" ");
//                System.out.println(Arrays.toString(numString));

                // Заполняем listArithmeticMean вещественными числами
                for (int i = 0; i <= numString.length - 20; i += 20) {
                    double arithmeticMean = 0;
                    double division = 0;
                    for (int j = i; j < i + 20; j++ ) {
                        arithmeticMean += Double.parseDouble(numString[j]);
                        division++;
                    }
                    listArithmeticMean.add(arithmeticMean / division);
                }
            }
//            System.out.println(listArithmeticMean);
            scanner1.close();

            // Заполняем фаил fail2.txt массивом listArithmeticMean
            PrintWriter printWriter = new PrintWriter(file_2);
            for (Double numDoub : listArithmeticMean) {
                printWriter.print(numDoub + " ");
            }
            printWriter.close();
            return file_2;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        return file_2;
    }

    public static void printResult(File file) {
        try {
            Scanner scanner1 = new Scanner(file);
            int sumArithmeticMean = 0;
            while (scanner1.hasNextLine()) {
                String[] numStringArithMean = scanner1.nextLine().split(" ");
//                System.out.println(Arrays.toString(numStringArithMean));
                for (String numString : numStringArithMean) {
                    // Автомотическое приведение double к int
                    sumArithmeticMean += Double.parseDouble(numString);
                }
            }
            scanner1.close();

            System.out.println(sumArithmeticMean);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

    }
}
