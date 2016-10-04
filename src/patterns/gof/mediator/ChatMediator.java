package patterns.gof.mediator;

/**
 * Created by ntsebryk on 04.10.2016.
 */
public class ChatMediator implements Mediator {
    private User user1;
    private User user2;

    public void setSourceUser1(User user1) {
        this.user1 = user1;
    }

    public void setSourceUser2(User user2) {
        this.user2 = user2;
    }

    @Override
    public void send(String message, User sourceUser) {
        if(sourceUser.equals(user1)) {
            user2.notify(message + " (" + sourceUser.userName + "). ");
        } else {
            user1.notify(message + " (" + sourceUser.userName + "). ");
        }
    }
}
