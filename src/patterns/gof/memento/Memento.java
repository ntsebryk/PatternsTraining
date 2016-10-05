package patterns.gof.memento;

/**
 * Created by ntsebryk on 05.10.2016.
 */
public class Memento {
    private final String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
