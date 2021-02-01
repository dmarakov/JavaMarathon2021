package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Сколько этажей?");
        int num = in.nextInt();
        if (num>=1 && num <=4){
            System.out.println("Малоэтажный дом");
        } else if(num>=5 && num <=8){
            System.out.println("Среднеэтажный дом");
        } else if (num>=9){
            System.out.println("Многоэтажный дом");
        } else if (num<=0){
            System.out.println("Ошибка воода");
        }
    }
}
