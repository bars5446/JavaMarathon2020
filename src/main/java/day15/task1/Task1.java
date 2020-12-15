package day15.task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("src/main/resources/shoes.csv");
        System.out.println(shoesReadFile(file));
        shoesWriteFile(shoesReadFile(file));
    }
    public static List<String> shoesReadFile(File file) {
        List<String> shoesList = new ArrayList<>();
        try {
            Scanner scanner1 = new Scanner(file);
            while (scanner1.hasNextLine()) {
                String[] numString = scanner1.nextLine().split(";");
                int num1 = Integer.parseInt(numString[1]);
                int num2 = Integer.parseInt(numString[2]);
                if (num1 < 0 || num2 < 0) {
                    throw new Exception();
                } else if (num2 == 0){
                    shoesList.add(numString[0] + " , " + numString[1] + " , " + numString[2]);
                }
            }
            scanner1.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (Exception e) {
            shoesList = new ArrayList<>();
            System.out.println("Некорректный входной файл.\n " +
                    "Колонка {Размер} или колонка {Кол-во} содержат отрицательное число");
        }
        return shoesList;
    }

    public static void shoesWriteFile(List<String> list) {
        File file = new File("src/main/resources/missing_shoes.txt");
        try {
            PrintWriter printWriter = new PrintWriter(file);
            for (String shoesLine : list) {
                printWriter.println(shoesLine);
            }
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
