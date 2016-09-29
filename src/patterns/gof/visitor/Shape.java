package patterns.gof.visitor;

/**
 * Created by ntsebryk on 29.09.2016.
 */
public interface Shape {
    void accept(DrawVisitor visitor);
}
