package day11.task1;

public class Warehouse {
    private int countPickedOrders;
    private int countDeliveredOrders;

    public void setCountPickedOrders() {
        this.countPickedOrders++;
    }

    public void setCountDeliveredOrders() {
        this.countDeliveredOrders++;
    }

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    @Override
    public String toString() {
        return "Количество собранных заказов : " + countPickedOrders + "\n" +
                "Количество доставленных заказов: " + countDeliveredOrders;
    }
}
