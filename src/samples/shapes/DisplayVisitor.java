package samples.shapes;

public class DisplayVisitor implements Visitor{
    @Override
    public void visitSquare(Square square) {
        System.out.println(square.getName());
        System.out.println("Type : " + square.getType());
        System.out.println("Width : " + square.getWidth());
        System.out.println("Perimeter : " + square.getPerimeter());
        System.out.println("Area : " + square.getArea() + "\n");
    }

    @Override
    public void visitCircle(Circle circle) {
        System.out.println(circle.getName());
        System.out.println("Type : " + circle.getType());
        System.out.println("Width : " + circle.getRadius());
        System.out.println("Perimeter : " + circle.getPerimeter());
        System.out.println("Surface : " + circle.getSurface() + "\n");
    }

    @Override
    public void visitPolygon(Polygon polygon) {
        System.out.println(polygon.getName());
        System.out.println("Type : " + polygon.getType());
        System.out.println("Number of side : " + polygon.getNumberOfSide() + "\n");
    }
}
