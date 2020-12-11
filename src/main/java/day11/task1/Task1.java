package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Picker picker = new Picker(warehouse);
        Courier courier = new Courier(warehouse);


        businessProcess(picker);
        businessProcess(courier);
        System.out.println(warehouse.toString());

        Warehouse warehouse1 = new Warehouse();
        Picker picker1 = new Picker(warehouse1);
        Courier courier1 = new Courier(warehouse1);

        System.out.println();
        businessProcess1(picker1);
        businessProcess1(courier1);
        System.out.println(warehouse1.toString());

    }
    public static void businessProcess(Worker worker) {
        for (int i = 0; i < 10000; i++) {
            worker.doWork();
        }
        worker.bonus();
        worker.bonus();
        System.out.println(worker.toString());
    }

    public static void businessProcess1(Worker worker) {
        for (int i = 0; i < 5000; i++) {
            worker.doWork();
        }
        worker.bonus();
        worker.bonus();
        System.out.println(worker.toString());
    }
}
