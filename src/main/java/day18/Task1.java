package day18;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};
        System.out.println(recursionSum(numbers, 0));
    }
    public static int recursionSum(int[] arrayNum, int index) {
        if (index < arrayNum.length) {
            return arrayNum[index] + recursionSum(arrayNum, index + 1);
        } else {
            return 0;
        }
    }
}
