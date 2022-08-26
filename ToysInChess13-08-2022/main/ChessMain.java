package main;
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

        HashMap<String, Piece> pieceHashMap = main.createdPieces();
        System.out.println(pieceHashMap);

        main.play(players, pieceHashMap);

        // for (Player player : players) {
        // System.out.println(player);
        // }

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
    public HashMap<String, Piece> createdPieces() {
        King whiteKing = new King(new Spot("h", 7), "whiteKing-1 ", true);
        King blackKing = new King(new Spot("d", 8), "blackKing-1 ", false);
        Rook whiteRook1 = new Rook(new Spot("a", 7), "Rook-1", true);
        Rook whiteRook2 = new Rook(new Spot("g", 7), "Rook-2", true);
        Knight blackKnight = new Knight(new Spot("d", 6), "Knight-1 ", false);

        HashMap<String, Piece> pieceHashMap = new HashMap<>();
        pieceHashMap.put(whiteKing.getId(), whiteKing);
        pieceHashMap.put(blackKing.getId(), blackKing);
        pieceHashMap.put(whiteRook1.getId(), whiteRook1);
        pieceHashMap.put(whiteRook2.getId(), whiteRook2);
        pieceHashMap.put(blackKnight.getId(), blackKnight);
        return pieceHashMap;

    }

    public void play(ArrayList<Player> players, HashMap<String, Piece> hashMap) {
        // move1
        try {
            players.get(0).movePiece(hashMap.get("Rook-1"), new Spot("a", 8));

        } catch (IllegalArgumentException error) {
            System.out.println("Ход НЕ КОРРЕКТЕН. Повторите");
            //retry functionality

        }
        players.get(1).movePiece(hashMap.get("Knight-1 "), new Spot("c", 8));
    }

}
