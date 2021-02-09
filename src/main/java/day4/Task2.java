package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        Random rand = new Random();
        int array[] = new int[100];
        int max = array[0];
        int zero = 0;
        int minValue = 10000;
        int zeroSum = 0;

        for (int x : array) {
            array[x] = rand.nextInt(10000);

            if (array[x] > max)
                max = array[x];
            if (array[x] < minValue)
                minValue = array[x];
            if (array[x] % 10 == 0){
                zero = zero+1;
                zeroSum = zeroSum + array[x];
            }



        }
        System.out.println("Наибольший элемент массива: " + max);
        System.out.println("Наименьший элемент массива: " + minValue);
        System.out.println("Количество элементов массива, оканчивающихся на 0: "+zero);
        System.out.println("Сумма элементов массива, оканчивающихся на 0: "+zeroSum);
    }
}
