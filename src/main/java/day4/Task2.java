package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        Random rand = new Random();
        int array[] = new int[100];
        int max = array[0];
        int minValue = 10000;

        for (int x : array) {
            array[x] = rand.nextInt(10000);

            if (array[x] > max)
                max = array[x];
            if (array[x] < minValue)
                minValue = array[x];


            System.out.println(array[x]);
        }
        System.out.println("Max= " + max);
        System.out.println("Min= " + minValue);

    }
}
