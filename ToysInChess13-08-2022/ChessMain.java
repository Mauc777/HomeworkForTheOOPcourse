public class ChessMain {

    public static void main(String[] args) {
        Player whitePlayer = new Player("Beth Harmon", "Beth.Harmon@mail.ru", true, 15, 25);
      
        Player blackPlayer = new Player("Vasilyi Borgov", "Vasilyi.Borgov@mail.ru", false, 16, 23);
        

        try{
        whitePlayer.setRank(2100);
        blackPlayer.setRank(222120);
        }
        catch(IllegalArgumentException err){
            System.out.println("Пожалуйста введите валтдные данные!!!");
        }

        System.out.println(whitePlayer);
        System.out.println(blackPlayer);
        




    }

}
