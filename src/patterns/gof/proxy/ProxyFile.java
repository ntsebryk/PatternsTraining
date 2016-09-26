package patterns.gof.proxy;

/**
 * Created by ntsebryk on 26.09.2016.
 */
public class ProxyFile implements File {
    private final String fullFileName;
    private RealFile realFile;

    public ProxyFile(String fullFileName) {
        this.fullFileName = fullFileName;
    }

    @Override
    public void showFile() {
        if(realFile == null) {
            realFile = new RealFile(fullFileName);
        }
        realFile.showFile();
    }
}
