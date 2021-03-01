package day7;

public class Task1 {
    public static   void main(String[] args) {
        Airplane plane1 = new Airplane("boing",1980, 2000,1000);
        Airplane plane2 = new Airplane("boing",1998, 3000,1500);
        Airplane.compareAirplanes(plane1,plane2);
    }
}