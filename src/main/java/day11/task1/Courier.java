package day11.task1;

public class Courier implements Worker {
    private int salary = 0;
    private boolean isPayed = false;
    private Warehouse warehouse;
    private int i = 0;

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public String toString() {
        return "Зарплата " + this.salary+ " "  + "бонус " + this.isPayed;
    }

    public void doWork() {
        i++;
        this.salary = this.salary + 100;
        warehouse.setCountDeliveredOrders(i);
    }

    @Override
    public void bonus() {
        if (!isPayed) {
            if (warehouse.getCountDeliveredOrders() == 10000) {
                this.salary = this.salary + 50000;
                isPayed = true;
            } else {
                System.out.println("Бонус пока не доступен");
            }
        }else{
            System.out.println("Бонус уже был выплачен");
        }
    }
}
