package patterns.gof.chainofresponsibilities;

/**
 * Created by ntsebryk on 27.09.2016.
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Logger: " + message);
    }
}
