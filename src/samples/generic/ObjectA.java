package samples.generic;

public class ObjectA extends Object{
    public ObjectA(int att1) {
        super(att1);
    }

    @Override
    public void acceptVisitor(Visitor visitor) {
        visitor.visitObjectA(this);
    }
}
