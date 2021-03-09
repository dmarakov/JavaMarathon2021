package day13;

public class Message {
    private User sender;
    private User receiver;
    private String test;
    private Date date;

    public Message(User sender, User receiver, String test) {
        this.sender = sender;
        this.receiver = receiver;
        this.test = test;
    }

    public User getSender() {
        return sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public String getTest() {
        return test;
    }

    public Date getDate() {
        return date;
    }
}
