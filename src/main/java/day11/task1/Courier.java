package day11.task1;

public class Courier implements Worker {
    private int salary;
    private int salaryStatic = 100;
    private boolean isPayed;
    private Warehouse warehouse;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    @Override
    public String toString() {
        return "Заработная плата : " + salary + "\n" +
                "Выплата бонуса : " + isPayed;
    }

    @Override
    public void doWork() {
        salary += salaryStatic;
        warehouse.incrementDelivered();
    }

    @Override
    public void bonus() {
        if (warehouse.getCountDeliveredOrders() < 10000) {
            System.out.println("Бонус пока не доступен");
        } else if (isPayed) {
            System.out.println("Бонус уже был выплачен");
        } else if (warehouse.getCountDeliveredOrders() == 10000) {
            isPayed = true;
            salary += 50000;
        }
    }
}
