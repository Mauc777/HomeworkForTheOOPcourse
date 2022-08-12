package T6_Game;

import java.util.ArrayList;

public class Game implements Menu{

    String namePlayer;
    String map;
    ArrayList<String> players = new ArrayList<>();
    Copy copy;

    public Game(String namePlayer, String map){
        this.map = map;
        this.namePlayer = namePlayer;
    }

    @Override
    public void save(Game game) {
        Copy newCopy = new Copy(game);
        game.copy = newCopy;
        newCopy.saveCopy(newCopy);
    }

    @Override
    public void load(Game game) {
        System.out.println(game.copy); 
    }


}
