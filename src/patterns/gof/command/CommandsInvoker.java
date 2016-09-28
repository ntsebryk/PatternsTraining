package patterns.gof.command;

import java.util.ArrayList;

/**
 * Created by ntsebryk on 28.09.2016.
 */
public class CommandsInvoker implements Runnable {
    private static CommandsInvoker commandsInvoker;

    private ArrayList<Command> commands = new ArrayList<>();

    public void addCommand(Command cmd) {
        commands.add(cmd);
    }

    private CommandsInvoker() {
    }

    public static CommandsInvoker getInstance() {
        CommandsInvoker localCommandInvoker = commandsInvoker;
        if (localCommandInvoker == null) synchronized (CommandsInvoker.class) {
            localCommandInvoker = commandsInvoker;
            if (localCommandInvoker == null) {
                localCommandInvoker = commandsInvoker = new CommandsInvoker();
            }
        }
        return localCommandInvoker;
    }

    public void run() {
        commands.stream().forEach(Command::execute);
    }
}
