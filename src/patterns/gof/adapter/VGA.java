package patterns.gof.adapter;

/**
 * Created by ntsebryk on 09.09.2016.
 */
public class VGA implements AnalogConnection {
    @Override
    public boolean connectAnalogDevice() {
        return true;
    }
}
