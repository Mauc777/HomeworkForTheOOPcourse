package T6_Game;

public class Programm {
    
    public static void main(String[] args) {
        
        Game game = new Game("PlayerGood", "map");
        game.players.add("Player1");
        game.players.add("Player2");
        game.save(game);
 
        Game game1 = new Game("PlayerBad", "map1");
        game1.players.add("Player1");
        game1.players.add("Player2");
        game1.players.add("Player3");
        game1.players.add("Player4");
        game1.map = "map4";
        game1.save(game1);

        Game game2 = new Game("PlayerNormal", "map2");
        game2.players.add("Player1");
        game2.map = "map10";
        game2.save(game2);    

        game.load(game);
        game2.load(game2);
    }
}
