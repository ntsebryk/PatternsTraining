package patterns.gof.command;

/**
 * Created by ntsebryk on 28.09.2016.
 */
public class CommandDemo {
    public static void main(String[] args) {
        DocumentReceiver document = new DocumentReceiver();

        Command cmd = new AddStringBegin(document, "Some text");
        Command cmd2 = new AddStingEnd(document, "Another text");

        CommandsInvoker ci = CommandsInvoker.getInstance();
        ci.addCommand(cmd);
        ci.addCommand(cmd2);
        ci.addCommand(cmd2);
        ci.addCommand(cmd);

        new Thread(ci).start();
    }
}
