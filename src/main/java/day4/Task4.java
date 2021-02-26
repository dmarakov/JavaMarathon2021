package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random rand = new Random();
        int sum = 0;
        int maxRang = 0;
        int maxSum = 0;
        int[] array = new int[100];

        for (int i = 0; i < array.length; i++)
            array[i] = rand.nextInt(10000);


            for (int i = 0; i < array.length-2; i++) {
                sum = 0;
                for (int j = i; j < i + 3; j++) {
                    sum = sum + array[j];
                }
                if (sum > maxSum) {
                    maxSum = sum;
                    maxRang = i;
                }
            }
        System.out.println("Максимальная сумма " +maxSum);
        System.out.println("Индекс "+maxRang);


    }

}




