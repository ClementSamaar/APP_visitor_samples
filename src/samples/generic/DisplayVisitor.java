package samples.generic;

public class DisplayVisitor implements Visitor {
    @Override
    public void visitObjectA(ObjectA objectA) { System.out.println(objectA.getAtt1()); }

    @Override
    public void visitObjectB(ObjectB objectB) { System.out.println(objectB.getAtt1()); }
}
