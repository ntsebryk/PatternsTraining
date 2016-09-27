package patterns.gof.chainofresponsibilities;

/**
 * Created by ntsebryk on 27.09.2016.
 */
public abstract class AbstractLogger {
    public static final int INFO = 1;
    public static final int DEBUG = 2;
    public static final int ERROR = 3;

    private AbstractLogger nextLogger;

    protected int level;

    public void setNextLogger(AbstractLogger logger) {
        this.nextLogger = logger;
    }

    public void logMessage(int level, String message) {
        if (this.level <= level) {
            this.write(message);
        }
        if (nextLogger != null) {
           nextLogger.logMessage(level, message);
        }
    }

    abstract protected void write(String message);
}
