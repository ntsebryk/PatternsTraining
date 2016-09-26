package patterns;

import patterns.gof.prototype.Project;
import patterns.gof.adapter.*;

/**
 * Created by ntsebryk on 09.09.2016.
 */
public class Executor {
    public static void main(String[] args) {
        executePrototype();
        executeAdapter();
    }

    private static void executePrototype() {
        Project pj = new Project();
        pj.doWork();
    }

    private static void executeAdapter() {
        AnalogConnection analogConnection = new VGA();
        DigitalConnection digitalConnection = new DigitalAdapter(analogConnection);
        digitalConnection.connectDigitalDevice();
    }
}
