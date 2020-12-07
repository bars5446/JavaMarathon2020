package day8;

public class Task1 {
    public static void main(String[] args) {
        long start1 = System.currentTimeMillis();
        String st1 = "";
        String st2 = " ";
        for (int i = 0; i < 20001; i++) {
            st1 += i + st2;
        }
        System.out.println(st1);
        long finish1 = System.currentTimeMillis();
        long timeConsumedMillis1 = finish1 - start1;
        System.out.println("Время с обычными строками: " + timeConsumedMillis1);

        long start2 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <20001 ; i++) {
            sb.append(i);
            sb.append(" ");
        }
        System.out.println(sb.toString());
        long finish2 = System.currentTimeMillis();
        long timeConsumedMillis2 = finish2 - start2;
        System.out.println("Время с помощью StringBuilder: " + timeConsumedMillis2);
    }
}
