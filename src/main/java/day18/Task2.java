package day18;

public class Task2 {
    public static int num_7_sum = 0;

    public static void main(String[] args) {
        System.out.println(count7(717771237));
    }
    // Работает, но я не уверен, что правильно было делать через статическую переменную
    public static int count7(int num) {
        if (num % 10 == 7) {
            num_7_sum++;
            count7(num / 10);
        } else if(num / 10 < 1) {
            return 0;
        } else {
            count7(num / 10);
        }
        return num_7_sum;
    }
}
