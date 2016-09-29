package patterns.gof.visitor;

/**
 * Created by ntsebryk on 29.09.2016.
 */
public class Rectangle implements Shape{
    private String name;
    private int size;

    public Rectangle(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void accept(DrawVisitor visitor) {
        visitor.visit(this);
    }
}
