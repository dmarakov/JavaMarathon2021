package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner firstNumber = new Scanner(System.in);
        Scanner secondNumber = new Scanner(System.in);

        while(true) {
            double a = firstNumber.nextDouble();
            double b = firstNumber.nextDouble();
              if ( b == 0) {
                break;
            }

            System.out.println(a / b);

        }
    }
}
