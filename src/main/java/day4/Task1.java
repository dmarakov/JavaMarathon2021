package day4;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int n = 0;
        int m = 0;
        int q = 0;
        int w = 0;
        int sum = 0;
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] numbers = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            numbers[i] = rand.nextInt(10);
           // System.out.print(numbers[i] + " ");
            sum = sum + numbers[i];
            if (numbers[i] > 8) {
                n = n + 1;
            } else if (numbers[i] == 1) {
                m = m + 1;

            } else if (numbers[i] % 2 == 0){
                q = q+1;
            }else
                w = w + 1;

        }
        System.out.println("Длина массива: " + arraySize);
        System.out.println("Количестве чисел больше 8: " + n);
        System.out.println("Количестве чисел равных 1: " + m);
        System.out.println("Количество четных чисел: " + q);
        System.out.println("Количество нечетных чисел: " + w);
        System.out.println("Сумма всех элементов массива: " + sum);


    }
}
