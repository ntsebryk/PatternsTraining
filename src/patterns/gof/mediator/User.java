package patterns.gof.mediator;

/**
 * Created by ntsebryk on 04.10.2016.
 */
public class User {
    protected Mediator mediator;
    protected String userName;

    public User(Mediator mediator,String userName) {
        this.mediator = mediator;
        this.userName = userName;
    }

    public void send(String message) {
        mediator.send(message, this);
    }

    public void notify(String message) {
        System.out.println(userName + " gets message:" + message);
    }

}
