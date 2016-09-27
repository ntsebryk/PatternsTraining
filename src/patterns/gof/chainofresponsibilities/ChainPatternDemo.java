package patterns.gof.chainofresponsibilities;

/**
 * Created by ntsebryk on 27.09.2016.
 */
public class ChainPatternDemo {

    public static void execute() {
        AbstractLogger loggerChain = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger infoLogger = new ConsoleLogger(AbstractLogger.INFO);
        loggerChain.setNextLogger(infoLogger);

        loggerChain.logMessage(AbstractLogger.ERROR, "This is error information");
        loggerChain.logMessage(AbstractLogger.INFO, "This is common information");

    }
}
