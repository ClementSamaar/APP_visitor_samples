package samples.generic;

public abstract class Object{
    private int att1;

    public Object(int att1) { this.att1 = att1; }
    public int getAtt1() { return att1; }
    public void setAtt1(int n) { att1 = n; }
    abstract public void acceptVisitor(Visitor visitor);
}
