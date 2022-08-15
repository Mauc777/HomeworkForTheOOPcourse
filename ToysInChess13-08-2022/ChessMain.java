public class ChessMain {

    public static void main(String[] args) {
        Player whitePlayer = new Player("Beth Harmon", "Beth.Harmon@mail.ru", true, 15, 25);
        System.out.println(whitePlayer);
        Player blackPlayer = new Player("Vasilyi Borgov", "Vasilyi.Borgov@mail.ru", false, 16, 23);
        System.out.println(blackPlayer);
        whitePlayer.getName();
        System.out.println(" Плейур"+ whitePlayer.getName());
        System.out.println(" Плейур"+ blackPlayer.getName());
        System.out.println(" Плейур"+ whitePlayer.getEmail());
        System.out.println( whitePlayer);


    }

}
