package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file = new File("people");
        parseFileToStringList(file);
    }
    public static List<String> parseFileToStringList(File file) {
        List<String> peopleList = new ArrayList<>();
        try {
            Scanner scanner1 = new Scanner(file);
            Scanner scanner2 = new Scanner(file);
/*
Пришлось сделать через 2 сканера, не могу понять как правильно поступить.
Есть ли возможность как-то по другому реализовать?
 */
            while (scanner1.hasNextLine()) {
                try {
                    String[] numString = scanner1.nextLine().split(" ");
                    int num = Integer.parseInt(numString[1]);
                    if (num < 0) {
                        throw new Exception();
                    } else {
                        peopleList.add(scanner2.nextLine());
                    }
                } catch (Exception e) {
                    peopleList = new ArrayList<>();
                    System.out.println("Некорректный входной файл");
                    break;
                }
            }
            scanner1.close();
            scanner2.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        return peopleList;
    }
}
