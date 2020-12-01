package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int leftEdge = scanner.nextInt();
        int rightEdge = scanner.nextInt();
        int a = leftEdge + 1;
        if (leftEdge < rightEdge) {
            while (a < rightEdge) {
                if (a % 5 == 0 && a % 10 != 0) {
                    System.out.print(a + " ");
                }
                a++;
            }
        } else {
            System.out.println("Некорректный ввод");
        }
    }
}
