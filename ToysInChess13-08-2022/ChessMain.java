import java.util.ArrayList;

public class ChessMain {

    public static void main(String[] args) {
        // Чистка КОНСОЛИ- полезная штука
        System.out.print("\033[H\033[J");

        // через создание объекта main класса ChessMain производится вызов метода
        // createPlayers()
        // куда мы перенесли создание Игроков
        ChessMain main = new ChessMain();
        ArrayList<Player> players = main.createPlayers();

        for (Player player : players) {
            System.out.println(player);
        }

    }

    // Создание самих Игроков Вынесено в отдельный метод
    public ArrayList<Player> createPlayers() {
        Player whitePlayer = new Player("Beth Harmon", "Beth-Harmon@mail.ru", true, 15, 25);
        Player blackPlayer = new Player("Vasilyi Borgov", "VasilyiBorgov@mail.ru", false, 16, 23);

        ArrayList<Player> players = new ArrayList<>();
        players.add(whitePlayer);
        players.add(blackPlayer);
        return players;

    }

}
