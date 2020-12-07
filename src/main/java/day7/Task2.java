package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        Player.info();
        Player player_1 = new Player(random.nextInt(11) + 90);
        Player player_2 = new Player(random.nextInt(11) + 90);
        Player player_3 = new Player(random.nextInt(11) + 90);
        Player player_4 = new Player(random.nextInt(11) + 90);
        Player player_5 = new Player(random.nextInt(11) + 90);
        Player player_6 = new Player(random.nextInt(11) + 90);
        Player player_7 = new Player(random.nextInt(11) + 90);
        Player.info();

        while (player_1.getStamina() != 0) {
            player_1.run();
        }

        Player.info();

        while (player_2.getStamina() != 0) {
            player_2.run();
        }
        Player.info();

        while (player_3.getStamina() != 0) {
            player_3.run();
        }

        Player.info();
    }
}
