package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    List<User> subscriptions;

    public User(String username) {
        this.username = username;
        this.subscriptions = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", subscriptions=" + subscriptions +
                '}';
    }

    public void subscribe(User user){
        this.subscriptions.add(user);
    }

    public boolean isFriend(User user){
        for(User testUser : subscriptions){
            testUser.getUsername().equals(user.getUsername());
            return true;
        }
            return false;
    }

    public void sendMessage(User user, String text){
        MessageDatabase.addNewMessage(this,user,text);
    }

}
