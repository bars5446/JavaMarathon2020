package day13;

public class Task1 {
    public static void main(String[] args) {

        User user1 = new User("user1");
        User user2 = new User("user2");

        MessageDatabase.addNewMessage(user1, user2, "Привет, как ты ?");
        MessageDatabase.addNewMessage(user2, user1, "Привет! хорошо, а ты как?");
        MessageDatabase.addNewMessage(user1, user2, "Да нормально, только что доделал задание");
        MessageDatabase.addNewMessage(user1, user2, "Надеюсь правильно");
        MessageDatabase.showDialog(user1, user2);

        System.out.println(MessageDatabase.getMessages().toString());
    }
}
