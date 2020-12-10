package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Picker picker = new Picker(80, warehouse);
        Courier courier = new Courier(100, warehouse);


        businessProcess(picker);
        businessProcess(courier);

        /*
        тесты на однокатный и двукратный вызов не проходять, хотя логика вроде верная.
        Не пойму что не так.
         */
        System.out.println();
        Picker picker2 = new Picker(80, warehouse);
        Courier courier2 = new Courier(100, warehouse);
        picker2.doWork();
        courier2.doWork();
        System.out.println(picker2.getSalary() + " " + courier2.getSalary());
        picker2.doWork();
        courier2.doWork();
        System.out.println(picker2.getSalary() + " " + courier2.getSalary());

    }
    public static void businessProcess(Worker worker) {
        for (int i = 0; i < 10000; i++) {
            worker.doWork();
        }
        worker.bonus();
        worker.bonus();
        System.out.println(worker.toString());
    }
}
