package samples.generic;

public class ObjectB extends Object{
    public ObjectB(int att1) { super(att1); }

    @Override
    public void acceptVisitor(Visitor visitor) {
        visitor.visitObjectB(this);
    }
}
