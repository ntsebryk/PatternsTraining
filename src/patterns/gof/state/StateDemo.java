package patterns.gof.state;

/**
 * Created by ntsebryk on 06.10.2016.
 */
public class StateDemo {
    public static void main(String[] args) {
        ClockContext clockContext = new ClockContext(5, 12);
        clockContext.ring();
    }
}
