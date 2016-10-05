package patterns.gof.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ntsebryk on 05.10.2016.
 */
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento state) {
        mementoList.add(state);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }
}
