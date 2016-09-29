package patterns.gof.visitor;

/**
 * Created by ntsebryk on 29.09.2016.
 */
public class Circle implements Shape{
    private String name;
    private int size;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Circle(String name, int size) {

        this.name = name;
        this.size = size;
    }

    @Override
    public void accept(DrawVisitor visitor) {
        visitor.visit(this);
    }
}
