package patterns.gof.command;

/**
 * Created by ntsebryk on 28.09.2016.
 */
public class DocumentReceiver {
    private StringBuffer document = new StringBuffer("");

    public void addStringBefore(String str) {
        document = new StringBuffer(str).append(document);
    }

    public void addStringAfter(String str) {
        document.append(str);
    }

    public void output(String str) {
        System.out.printf("Operation [%s]: resutlt = %s \n", str, document.toString());
    }
}
