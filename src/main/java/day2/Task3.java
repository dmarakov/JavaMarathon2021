package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int i = num1;
        if (num2 >= num1) {
            while (num2 > i) {
                if (i % 5 == 0 && i % 10 != 0 && i != num1) {
                    System.out.print(i+" ");

                }i++;
            }
        } else System.out.println("Некорректный ввод");

    }

}
