package patterns;

import patterns.gof.adapter.AnalogConnection;
import patterns.gof.adapter.DigitalAdapter;
import patterns.gof.adapter.DigitalConnection;
import patterns.gof.adapter.VGA;
import patterns.gof.iterator.IteratorDemo;
import patterns.gof.prototype.Project;

/**
 * Created by ntsebryk on 09.09.2016.
 */
public class Executor {
    public static void main(String[] args) {
        //executePrototype();
        //executeAdapter();
        //ChainPatternDemo.execute();
        //VisitorDemo.execute();
        IteratorDemo.execute();
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
