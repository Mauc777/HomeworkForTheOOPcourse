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
        ArrayList<Piece> pieces = main.createdPieces();

        for (Piece piece : pieces) {
            System.out.println(piece);    
        }

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

    public ArrayList<Piece> createdPieces(){
        King whiteKing = new King(new Spot("H", 7),"whiteKing", true );
        King blackKing = new King(new Spot("D", 8),"blackKing", false );
        Rook whiteRook = new Rook(new Spot("A", 7), "Rook-1", true);
        Rook whiteRook2 = new Rook(new Spot("G", 7), "Rook-2", true);
        Knight blackKnight = new Knight(new Spot("D", 6), "Knight-1", false);

        ArrayList<Piece> pieces = new ArrayList<>();
        pieces.add(whiteKing);
        pieces.add(blackKing);
        pieces.add(whiteRook);
        pieces.add(whiteRook2);
        pieces.add(blackKnight);
        return pieces;
    }

}
