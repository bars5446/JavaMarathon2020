package day7;

public class Player {
    private int stamina;
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    private static int countPlayers = 0;
    private static int reservePlayer = 0;

    public Player(int stamina) {
        if (stamina <= MAX_STAMINA && stamina > MIN_STAMINA) {
            this.stamina = stamina;
        }
        if (countPlayers < 6) {
            countPlayers++;
        } else {
            reservePlayer++;
        }
    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public void run() {
        if (stamina > 0) {
            this.stamina--;
            if (stamina == 0) {
                if (reservePlayer > 0) {
                    reservePlayer--;
                    System.out.println("Игкор устал. Выходит замена.");
                } else {
                    countPlayers--;
                    System.out.println("Игкор устал. На замену игроков нет.");
                }
            }
        }
    }

    public static void info() {
        if (countPlayers == 6) {
            System.out.println("На поле нет свободных мест");
        } else if (countPlayers == 5) {
            System.out.println("Команды неполные. На поле еще есть " +
                    Player.numPlayers(6 - countPlayers) + " свободное место");
        } else if (countPlayers <= 4 && countPlayers >= 2){
            System.out.println("Команды неполные. На поле еще есть " +
                    Player.numPlayers(6 - countPlayers) + " свободных места");
        } else if (countPlayers == 1) {
            System.out.println("Команды неполные. На поле еще есть " +
                    Player.numPlayers(6 - countPlayers) + " свободных мест");
        } else {
            System.out.println("Игроки на на поле отсутствуют");
        }
    }

    public static String numPlayers(int countPlayers) {
        String numPlayersString = " ";
        switch (countPlayers) {
            case 5:
                numPlayersString = "пять";
                break;
            case 4:
                numPlayersString = "четыре";
                break;
            case 3:
                numPlayersString = "три";
                break;
            case 2:
                numPlayersString = "два";
                break;
            case 1:
                numPlayersString = "одно";
                break;
        }
        return numPlayersString;
    }
}
