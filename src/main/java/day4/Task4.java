package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random rand = new Random();
        int sum = 0;
        int maxRang = 0;
        int maxSum = 0;
        int [] array = new int[10];
        for (int i = 0; i< array.length;i++){
            array[i] = rand.nextInt(1000);
            sum = sum + array[i];
            System.out.print(array[i]+" ");
            if(sum>maxSum){
                maxSum = sum;
                maxRang = i-2;}
            if(i%3 == 0 && i>0){
                System.out.println("Сумма "+sum);
                sum = 0;


            }
            }
        System.out.println();
        System.out.println("Сумма " +maxSum);
        System.out.println("Индекс "+maxRang);
        }
    }

