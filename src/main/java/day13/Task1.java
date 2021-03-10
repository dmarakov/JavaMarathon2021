package day13;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<User> subscriptions = new ArrayList<>();
        User user1 = new User("Kolya");
        User user2 = new User("Vanya");
        user1.subscribe(user2);

        System.out.println(user1.isFriend(user2));
        System.out.println(user1);

    }
}
