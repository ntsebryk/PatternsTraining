package patterns.gof.mediator;

/**
 * Created by ntsebryk on 04.10.2016.
 */
interface Mediator {
    void send(String message, User sourceUser);
}

