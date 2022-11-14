package test.generic;

import samples.generic.ComputeAtt1Visitor;
import samples.generic.DisplayVisitor;
import samples.generic.ObjectA;
import samples.generic.ObjectB;

public class Test {
    public static void main(String[] args) {
        ObjectA objectA = new ObjectA(2);
        ObjectB objectB = new ObjectB(2);
        objectA.acceptVisitor(new ComputeAtt1Visitor());
        objectB.acceptVisitor(new ComputeAtt1Visitor());
        objectA.acceptVisitor(new DisplayVisitor());
        objectB.acceptVisitor(new DisplayVisitor());
    }
}