package day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        while(true) {
            Scanner scanner = new Scanner(System.in);
            String city = scanner.nextLine();
            switch (city) {
                case "Москва", "Владивосток", "Ростов":
                    System.out.println("Россия");
                    continue;
                case "Рим", "Милан", "Турин":
                    System.out.println("Италия");
                    continue;
                case "Ливерпуль", "Манчестер", "Лондон":
                    System.out.println("Англия");
                    continue;
                case "Берлин", "Мюнхен", "Кёльн":
                    System.out.println("Германия");
                    continue;
                case "Stop":
                    break;
                default:
                    System.out.println("Неизвестная страна");
                    continue;

            }break;
        }


    }
}
