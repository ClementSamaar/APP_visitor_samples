package samples.shapes;

public interface Visitor {
    void visitSquare(Square square);
    void visitCircle(Circle circle);
    void visitPolygon(Polygon polygon);
}
