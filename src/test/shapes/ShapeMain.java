package test.shapes;

import samples.shapes.*;

public class ShapeMain {
    public static void main(String[] args) {
        Square square1 = new Square("Square 1", 5);
        Circle circle1 = new Circle("Circle 1", 7.85);
        Polygon polygon1 = new Polygon("Polygon 1", 5);

        square1.acceptVisitor(new DisplayVisitor());
        circle1.acceptVisitor(new DisplayVisitor());
        polygon1.acceptVisitor(new DisplayVisitor());

        square1.acceptVisitor(new SetVisitor());
        circle1.acceptVisitor(new SetVisitor());
        polygon1.acceptVisitor(new SetVisitor());

        square1.acceptVisitor(new DisplayVisitor());
        circle1.acceptVisitor(new DisplayVisitor());
        polygon1.acceptVisitor(new DisplayVisitor());
    }
}
