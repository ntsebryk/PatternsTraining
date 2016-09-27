package patterns.gof.chainofresponsibilities;

/**
 * Created by ntsebryk on 27.09.2016.
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Console Logger: " + message);
    }
}
