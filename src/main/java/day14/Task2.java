package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file = new File("people");
        System.out.println(parseFileToStringList(file));
    }
    public static List<String> parseFileToStringList(File file) {
        List<String> peopleList = new ArrayList<>();
        try {
            Scanner scanner1 = new Scanner(file);
            while (scanner1.hasNextLine()) {
                String[] numString = scanner1.nextLine().split(" ");
                int num = Integer.parseInt(numString[1]);
                if (num < 0) {
                    throw new Exception();
                } else {
                    // Вчера вечером долго не мог додуматься до этого, а на деле оказалось все просто
                    peopleList.add(numString[0] + " " + numString[1]);
                }
            }
            scanner1.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (Exception e) {
            peopleList = new ArrayList<>();
            System.out.println("Некорректный входной файл");
        }
        return peopleList;
    }
}
