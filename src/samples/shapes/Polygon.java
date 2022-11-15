package samples.shapes;

public class Polygon extends Shape{
    private int numberOfSide;

    public Polygon(String name, int numberOfSide){
        super(name, "");
        this.numberOfSide = numberOfSide;
        this.setType();
    }

    public void setType() {
        switch (this.numberOfSide) {
            case 3 -> this.setType("Triangle");
            case 4 -> this.setType("Quadrilateral");
            case 5 -> this.setType("Pentagon");
            case 6 -> this.setType("Hexagon");
            case 7 -> this.setType("Heptagon");
            case 8 -> this.setType("Octagon");
        }
    }

    public int getNumberOfSide() {
        return numberOfSide;
    }

    public void setNumberOfSide(int numberOfSide) { this.numberOfSide = numberOfSide; }

    @Override
    public void acceptVisitor(Visitor visitor) {
        visitor.visitPolygon(this);
    }
}
