package expDeepdive0827Shape;

public abstract class AbstractShape implements Shape {
    protected String name;

    public AbstractShape(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}