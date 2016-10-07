package patterns.gof.template;

/**
 * Created by ntsebryk on 07.10.2016.
 */
public class Football extends Game {
    @Override
    protected void initGame() {
        System.out.println("Starting football match");
    }

    @Override
    protected void playGame() {
        System.out.println("Playing football match");
    }

    @Override
    protected void finishGame() {
        System.out.println("Ending football match");
    }
}
