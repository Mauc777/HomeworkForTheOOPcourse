package T6_Game;
public class Copy {

    Game game;

    public Copy(Game game) {
        this.game = game;
    }

    public void saveCopy(Copy copy) {
        Repository.rep.add(copy);
    }

    @Override
    public String toString() {
        return String.format("%s; %s; количество игроков: %d", this.game.namePlayer, this.game.map,
                this.game.players.size());
    }

}