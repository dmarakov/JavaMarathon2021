package day8;

public class Task1 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();


   //     StringBuilder sb = new StringBuilder();
        String bigOne = "";
//     for (int i = 0; i <= 20000; i++) {
//            sb.append(i).append(" ");
//
//
//       }

        for (int i = 0; i <= 20000; i++) {
            bigOne = bigOne + i + " ";

        }
        long finish = System.currentTimeMillis();
        long timeConsumedMillis = finish - start;
       // System.out.print(sb.toString());
        System.out.print(bigOne);
        System.out.println(timeConsumedMillis);
    }
}
