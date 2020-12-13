package day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    private static List<Message> messages = new ArrayList<>();

    public static void addNewMessage(User u1, User u2, String text) {
        Message message = new Message(u1, u2, text);
        messages.add(message);
    }

    public static List<Message> getMessages() {
        return messages;
    }

    public static void showDialog(User u1, User u2) {
        for (Message message : getMessages()) {
            if (message.getSender().getUsername() == u1.getUsername() &&
                    message.getReceiver().getUsername() == u2.getUsername()) {
                System.out.println(u1.getUsername() + ": " + message.getText());
            } else if (message.getSender().getUsername() == u2.getUsername() &&
                    message.getReceiver().getUsername() == u1.getUsername()) {
                System.out.println(u2.getUsername() + ": " + message.getText());
            }
        }
    }
}
