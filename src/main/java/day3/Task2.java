package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            double n1 = scanner.nextDouble();
            double n2 = scanner.nextDouble();
            if (n2 == 0) {
                break;
            }
            System.out.println(n1 / n2);
        }
    }
}
