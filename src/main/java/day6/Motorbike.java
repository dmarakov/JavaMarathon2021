package day6;

class Motorbike {
     private String color;
     private String model;
     private int year;

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

    void info(){
        System.out.println("Это мотоцикл");
    }
    int yearDifference(int inputYear){
        return Math.abs(inputYear - year);
    }
}
