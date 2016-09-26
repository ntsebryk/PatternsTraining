package patterns.gof.proxy;

/**
 * Created by ntsebryk on 26.09.2016.
 */
public class RealFile implements File {
    private final String fullFileName;

    public RealFile(String fullFileName) {
        this.fullFileName = fullFileName;
        loadFile();
    }


    private void loadFile() {
        System.out.println("Loading" + fullFileName);
    }

    @Override
    public void showFile() {
        System.out.println("Showing " + fullFileName);
    }
}
