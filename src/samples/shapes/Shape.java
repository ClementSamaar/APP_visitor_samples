package samples.shapes;

public abstract class Shape {
    private final String name;
    private String type;

    public Shape(String name, String type){
        this.name = name;
        this.type = type;
    }

    public String getName() { return name; }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }


    abstract public void acceptVisitor(Visitor visitor);
}
