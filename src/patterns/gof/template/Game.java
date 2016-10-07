package patterns.gof.template;

/**
 * Created by ntsebryk on 07.10.2016.
 */
public abstract class Game {
    protected abstract void initGame();
    protected abstract void playGame();
    protected abstract void finishGame();

    public final void play() {
        initGame();
        playGame();
        finishGame();
    }
}
