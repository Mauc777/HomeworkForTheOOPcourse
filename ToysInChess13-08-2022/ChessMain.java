public class ChessMain {

    public static void main(String[] args) {
        Player whitePlayer = new Player("Beth Harmon", "Beth-Harmon@mail.ru", true, 15, 25);
      
        Player blackPlayer = new Player("Vasilyi Borgov", "VasilyiBorgov@mail.ru", false, 16, 23);
        

        try{
        whitePlayer.setRank(2100);
        blackPlayer.setRank(222120);
        }
        catch(IllegalArgumentException err){
            System.out.println("Пожалуйста введите валидные данные для одного из игроков!!!");
        }
                                                            

        System.out.println(whitePlayer);
        System.out.println(blackPlayer);
        




    }

}
