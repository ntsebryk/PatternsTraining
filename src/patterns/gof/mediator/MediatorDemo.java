package patterns.gof.mediator;

/**
 * Created by ntsebryk on 04.10.2016.
 */
public class MediatorDemo {

    public static void main(String[] args) {
        ChatMediator m = new ChatMediator();

        User user1 = new User(m, "Alex");
        User user2 = new User(m, "John");

        m.setSourceUser1(user1);
        m.setSourceUser2(user2);

        user1.send("Hey!");
        user2.send("Hi! How are you?");
        user1.send("I'm fine, thanks =)");
    }


}
