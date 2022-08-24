import java.util.ArrayList;
import java.util.HashMap;

public class ChessMain {

    public static void main(String[] args) {
        // Чистка КОНСОЛИ- полезная штука
        System.out.print("\033[H\033[J");

        // через создание объекта main класса ChessMain производится вызов метода
        // createPlayers()
        // куда мы перенесли создание Игроков
        ChessMain main = new ChessMain();
        ArrayList<Player> players = main.createPlayers();

        HashMap<String, Piece> pieceHashMap =  main.createdPieces();
        System.out.println(pieceHashMap);

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

    // public ArrayList<Piece> createdPieces(){
    public HashMap <String, Piece> createdPieces() {
        King whiteKing = new King(new Spot("H", 7), "whiteKing-1 ", true);
        King blackKing = new King(new Spot("D", 8), "blackKing-1 ", false);
        Rook whiteRook1 = new Rook(new Spot("A", 7), "Rook-1 ", true);
        Rook whiteRook2 = new Rook(new Spot("G", 7), "Rook-2 ", true);
        Knight blackKnight = new Knight(new Spot("D", 6), "Knight-1 ", false);


        HashMap <String, Piece> pieceHashMap =  new HashMap<>();
        pieceHashMap.put(whiteKing.getId(), whiteKing);
        pieceHashMap.put(blackKing.getId(), blackKing);
        pieceHashMap.put(whiteRook1.getId(),whiteRook1);
        pieceHashMap.put(whiteRook2.getId(), whiteRook2);
        pieceHashMap.put(blackKnight.getId(), blackKnight);
        return pieceHashMap;

    }

}
