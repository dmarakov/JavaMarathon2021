package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[][] matrice = new int[4][2];
        int maxSum = 0;
        int rowMax = 0;
        for (int i = 0; i < matrice.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrice[i].length; j++) {
                matrice[i][j] = rand.nextInt(20);
                System.out.print(matrice[i][j] + " ");
                sum = sum + matrice[i][j];
                if (sum > maxSum) {
                    maxSum = sum;
                    rowMax = i;
                }


            }
            System.out.println("Сумма = " + sum);

            System.out.println();
        }
        System.out.println("Индекс = " + rowMax);
        System.out.println("MaxСумма = " + maxSum);


    }
}
