package patterns.gof.template;

/**
 * Created by ntsebryk on 07.10.2016.
 */
public class TemplateDemo {
    public static void main(String[] args) {
        Game game = new Football();
        game.play();

        game = new Basketball();
        game.play();
    }
}
