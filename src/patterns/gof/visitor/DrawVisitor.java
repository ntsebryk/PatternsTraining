package patterns.gof.visitor;

/**
 * Created by ntsebryk on 29.09.2016.
 */
public interface DrawVisitor {
    void visit(Rectangle shape);
    void visit(Circle circle);
}
