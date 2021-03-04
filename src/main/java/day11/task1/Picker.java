package day11.task1;

public class Picker implements Worker {
    private int salary = 0;
    private  boolean isPayed = false;
    private Warehouse warehouse;
    private int i = 0;

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }
    public String toString(){
        return "Зарплата " + this.salary+ " " +  "бонус " +this.isPayed;
    }

    public void doWork(){
        i++;
        this.salary = this.salary + 80;
        warehouse.setCountPickedOrders(i);
    }

    @Override
    public void bonus() {
        if (!isPayed) {
            if (warehouse.getCountPickedOrders() == 10000) {
                this.salary = this.salary + 70000;
                isPayed = true;

            } else {
                System.out.println("Бонус пока не доступен");
            }
        }else{
            System.out.println("Бонус уже был выплачен");
        }
    }
}
