package day7;

public class Airplane {
    private String producer;
    private int year;
    private int lenght;
    private int weight;
    private int fuel;

    public Airplane(String producer, int year, int lenght, int weight){
        this.producer = producer;
        this.year = year;
        this.lenght = lenght;
        this.weight = weight;
        this.fuel = fuel;
    }

    public void setProducer(String airplaneProducer) {
        if (airplaneProducer.isEmpty()) {
            System.out.println("Это поле не может быть пустым");
        } else {
            producer = airplaneProducer;
        }
    }

        public void setYear ( int airplaneYear) {
            if (airplaneYear < 0) {
                System.out.println("Год не может быть отрицательным");
            } else {
                year = airplaneYear;
            }
        }

            public void setLength ( int airplaneLength){
                if (airplaneLength < 0) {
                    System.out.println("Длинна не может быть отрицательным");
                } else {
                    lenght = airplaneLength;
                }
            }
            public int getLenght(){
        return lenght;
            }

            public void setWeight ( int airplaneWeight){
                if (airplaneWeight < 0) {
                    System.out.println("Вес не может быть отрицательным");
                } else {
                    weight = airplaneWeight;
                }
            }
            public void setFuel ( int airplaneFuel){
                    fuel = 0; }

            public int getFuel(){
        return fuel; }

        public void fillUp (int n){
        fuel = fuel + n;
        }
        public void info(){
            System.out.println("Изготовитель: "+ producer+", год выпуска: " + year+", длина: " + lenght+", вес: "+weight+", количество топлива в баке: "+fuel);
        }
public static void compareAirplanes(Airplane plane1, Airplane plane2){
        if(plane1.getLenght()>plane2.getLenght()){
            System.out.println("Первый самолет длиннее");
        }if (plane1.getLenght() == plane2.getLenght()){
        System.out.println("Длины равны");
    }
        else{
            System.out.println("Второй самолет длинее");
        }

}
        }