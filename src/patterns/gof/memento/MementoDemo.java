package patterns.gof.memento;

/**
 * Created by ntsebryk on 05.10.2016.
 */
public class MementoDemo {

    public static void main(String... args) {
        CareTaker careTaker = new CareTaker();

        Originator originator = new Originator();
        originator.setState("First State");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("Second State");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("Third State");
        System.out.println("Current state: " + originator.getState());

        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Undo state: " + originator.getState());

        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("Second Undo state: " + originator.getState());

        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Redo state: " + originator.getState());
    }
}
