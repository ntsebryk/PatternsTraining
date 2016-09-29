package patterns.gof.visitor;

/**
 * Created by ntsebryk on 29.09.2016.
 */
public class VectorDrawVisitor implements DrawVisitor{
    @Override
    public void visit(Rectangle shape) {
        System.out.printf("Drawing Vector shape[%s] with size: %d \n", shape.getName(), shape.getSize());
    }

    @Override
    public void visit(Circle circle) {
        System.out.printf("Drawing Vector Circle[%s] with size: %d \n", circle.getName(), circle.getSize());
    }
}

