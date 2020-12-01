package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int leftEdge = scanner.nextInt();
        int rightEdge = scanner.nextInt();

            if (leftEdge < rightEdge) {
                for (int i = leftEdge + 1; i < rightEdge ; i++) {
                    if (i % 5 == 0 && i % 10 != 0) {
                        System.out.print(i + " ");
                    }
                }
            } else {
                System.out.println("Некорректный ввод");
            }
    }
}
