package samples.generic;

public class ComputeAtt1Visitor implements Visitor{
    @Override
    public void visitObjectA(ObjectA objectA) {
        objectA.setAtt1(objectA.getAtt1() + 2);
    }

    @Override
    public void visitObjectB(ObjectB objectB) {
        objectB.setAtt1(objectB.getAtt1() * 2 + 2);
    }
}
