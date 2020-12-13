package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<User> subscriptions;

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

    public void subscribe(User user) {
        getSubscriptions().add(user);
    }

    public boolean isSubscribed(User user) {
        return getSubscriptions().contains(user);
    }

    public boolean isFriend(User user) {
        boolean friends = false;
        if (getSubscriptions().contains(user) && user.getSubscriptions().contains(this)) {
            friends = true;
        }
/*В начале сделал таким вот циклом (все работало, и тесты проходились),
но потом нагуглил что можно через "this" ссылаться на этот класс внустри класса
if (getSubscriptions().contains(user)) {
            for (User user1 : user.getSubscriptions()) {
                if (user1.getUsername().equals(getUsername())) {
                    friends = true;
                    break;
                }
            }
        }
 */
        return friends;
    }

    public void sendMessage(User user, String text) {
        MessageDatabase.addNewMessage(this, user, text);
    }

    @Override
    public String toString() {
        return getUsername();
    }
}
