package day6;

public class Task1 {
    public static void main(String[] args) {
        Car ford = new Car();
        ford.setYear(1980);
        ford.info();
        System.out.println(ford.yearDifference(1990));
    }
}
