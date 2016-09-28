package patterns.gof.command;

/**
 * Created by ntsebryk on 28.09.2016.
 */
public class AddStingEnd implements Command {
    private DocumentReceiver documentReceiver;
    private String str;

    public AddStingEnd(DocumentReceiver documentReceiver, String str) {
        this.documentReceiver = documentReceiver;
        this.str = str;
    }

    @Override
    public void execute() {
        documentReceiver.addStringAfter(str);
        documentReceiver.output(String.format("Add String (%s) After Document", str));
    }
}
