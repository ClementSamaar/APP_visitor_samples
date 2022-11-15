package samples.shapes;

import static java.lang.Math.PI;

public class Circle extends Shape{
    private double radius;
    private double perimeter;
    private double surface;

    public Circle (String name, double radius){
        super(name, "Circle");
        this.radius = radius;
        this.perimeter = 2 * PI * this.radius;
        this.surface = 2 * PI * this.radius * this.radius;
    }

    public double getRadius() { return radius; }

    public double getPerimeter() { return perimeter; }

    public double getSurface() { return surface; }

    public void setRadius(double radius) { this.radius = radius; }
    public void setPerimeter(double perimeter) { this.perimeter = perimeter; }
    public void setSurface(double surface) { this.surface = surface; }
    @Override
    public void acceptVisitor(Visitor visitor) {
        visitor.visitCircle(this);
    }
}
