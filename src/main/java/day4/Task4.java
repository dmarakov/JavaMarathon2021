package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random rand = new Random();
        int [] sum = new int[3];
        int maxSum = 0;
        int [] array = new int[100];
        for (int i = 0; i< array.length;i++){
            array[i] = rand.nextInt(100);
        }

    }
}
