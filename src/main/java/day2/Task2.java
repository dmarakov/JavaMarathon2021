package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число");
        int num1 = in.nextInt();
        System.out.println("Введите второе число");
        int num2 = in.nextInt();
        if (num2>num1){
        for (int i = num1; num2 > i; i++) {
            if (i % 5 == 0 && i % 10 != 0 && i!=num1) {
                System.out.println(i);
            }
        }
        }
        if (num1>num2){
            System.out.println("Некорректный ввод");
        }
    }
}