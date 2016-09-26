package patterns.gof.adapter;

/**
 * Created by ntsebryk on 09.09.2016.
 */
public class DigitalAdapter implements  DigitalConnection{

    private AnalogConnection connection = null;


    public DigitalAdapter(AnalogConnection connection) {
        this.connection = connection;
    }

    @Override
    public boolean connectDigitalDevice() {
        return connection.connectAnalogDevice();
    }
}
