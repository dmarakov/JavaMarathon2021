package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomStamina = random.nextInt(10)+90;
        Player p1 = new Player(randomStamina);
        Player p2 = new Player(randomStamina);
        Player p3 = new Player(randomStamina);
        Player p4 = new Player(randomStamina);
        Player p5 = new Player(randomStamina);
        Player p6 = new Player(randomStamina);
        p1.info();
        Player.getCountPlayers();


    }
}
