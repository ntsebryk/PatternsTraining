package patterns.gof.template;

/**
 * Created by ntsebryk on 07.10.2016.
 */
public class Basketball extends Game {
    @Override
    protected void initGame() {
        System.out.println("Starting basketball match");
    }

    @Override
    protected void playGame() {
        System.out.println("Playing basketball match");
    }

    @Override
    protected void finishGame() {
        System.out.println("Ending basketball match");
    }
}
