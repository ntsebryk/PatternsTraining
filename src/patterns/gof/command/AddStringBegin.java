package patterns.gof.command;

/**
 * Created by ntsebryk on 28.09.2016.
 */
public class AddStringBegin implements Command {
    private DocumentReceiver documentReceiver;
    private String str;

    public AddStringBegin(DocumentReceiver documentReceiver, String str) {
        this.documentReceiver = documentReceiver;
        this.str = str;
    }

    @Override
    public void execute() {
        documentReceiver.addStringBefore(str);
        documentReceiver.output(String.format("Add String (%s) Before Document", str));
    }
}
