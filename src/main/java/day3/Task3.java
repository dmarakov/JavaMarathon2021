package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner firstNumber = new Scanner(System.in);
        Scanner secondNumber = new Scanner(System.in);
int i = 0;
        while(i<5) {
            i++;
            double a = firstNumber.nextDouble();
            double b = firstNumber.nextDouble();
            if ( b == 0) {
                System.out.println("Деление на 0");
                continue;
            }

            System.out.println(a / b);

        }
    }
}