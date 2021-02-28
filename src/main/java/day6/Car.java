package day6;

public class Car {
    private String color;
    private String model;
    private int year;

    public void setColor(String carColor){
        if(carColor.isEmpty()){
            System.out.println("Вы ввели пустое поле");
        }else{
            color = carColor;
        }
    }
    public String getColor(){
        return color;
    }
    public void setModel(String setModel){
        if(setModel.isEmpty()){
            System.out.println("Вы ввели пустое поле");
        }else{
            model = setModel;
        }
    }
    public String getModel(){
        return model;
    }
    public void setYear(int setYear){
        if(setYear < 0){
            System.out.println("Год должен быть больше нуля");
        }else{
            year = setYear;
        }
    }
    public int getYear(){
        return year;
    }
   public void info(){
        System.out.println("Это автомобиль");
    }
    public int yearDifference(int inputYear){
        return year - inputYear;
    }
}
