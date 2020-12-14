package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        File file = new File("people");
        System.out.println(parseFileToObjList(file).toString());
    }
    public static List<Person> parseFileToObjList(File file) {
        List<Person> peopleList = new ArrayList<>();
        try {
            Scanner scanner1 = new Scanner(file);
/*
А тут обошлось одним сканером
 */
            while (scanner1.hasNextLine()) {
                try {
                    String[] numString = scanner1.nextLine().split(" ");
                    int num = Integer.parseInt(numString[1]);
                    if (num < 0) {
                        throw new Exception();
                    } else {
                        peopleList.add(new Person(numString[0], num));
                    }
                } catch (Exception e) {
                    peopleList = new ArrayList<>();
                    System.out.println("Некорректный входной файл");
                    break;
                }
            }
            scanner1.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        return peopleList;
    }
}
