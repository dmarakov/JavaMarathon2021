package day5;

public class Task2 {
    public static void main(String[] args) {
        Motorbike honda = new Motorbike("Blue","K400", 1980);
        System.out.println(honda.getColor());
        System.out.println(honda.getModel());
        System.out.println(honda.getYear());
    }
}

class Motorbike {
     String color;
     String model;
     int year;
    public Motorbike(String color, String model, int year){
        this.color=color;
        this.model=model;
        this.year=year;
    }
    public String getColor(){
        return color;}

    public String getModel(){
        return model;}

    public int getYear(){
        return year;}
}
