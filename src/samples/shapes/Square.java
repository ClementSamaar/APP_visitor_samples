package samples.shapes;

public class Square extends Shape{
    protected static final int NUMBER_OF_SIDE = 4;
    private double width;
    private double perimeter;
    private double area;
    public Square(String name, double sideLength) {
        super(name, "Square");
        this.width = sideLength;
        this.perimeter = NUMBER_OF_SIDE * this.width;
        this.area = this.width * this.width;
    }

    public double getWidth() { return width; }
    public double getPerimeter() { return perimeter; }
    public double getArea() { return area; }

    public void setWidth(double width){ this.width = width; }
    public void setPerimeter(double perimeter) { this.perimeter = perimeter; }
    public void setArea(double area) { this.area = area; }

    @Override
    public void acceptVisitor(Visitor visitor) {
        visitor.visitSquare(this);
    }

}
