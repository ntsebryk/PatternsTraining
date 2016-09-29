package patterns.gof.visitor;

import java.util.stream.Stream;

/**
 * Created by ntsebryk on 29.09.2016.
 */
public class VisitorDemo {
    public static void execute() {
        final DrawVisitor drawVisitor = new RasterDrawVisitor();
        Stream.of(new Circle("Big",5), new Rectangle("Medium", 3)).forEach(e-> e.accept(drawVisitor));
        final DrawVisitor drawVisitor1 = new VectorDrawVisitor();
        Stream.of(new Rectangle("Small",1), new Circle("Large",10)).forEach(e -> e.accept(drawVisitor1));
    }
}
