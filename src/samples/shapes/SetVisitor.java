package samples.shapes;

import java.util.Scanner;

import static java.lang.Math.PI;

public class SetVisitor implements Visitor{
    final Scanner input = new Scanner(System.in);
    @Override
    public void visitSquare(Square square) {
        System.out.println("Set " + square.getName() + "\nPlease enter the width value\n");
        square.setWidth(input.nextDouble());
        square.setPerimeter(Square.NUMBER_OF_SIDE * square.getWidth());
        square.setArea(square.getWidth() * square.getWidth());
    }

    @Override
    public void visitCircle(Circle circle) {
        Scanner input = new Scanner(System.in);
        System.out.println("Set " + circle.getName() + "\nPlease enter the radius value\n");
        circle.setRadius(input.nextDouble());
        circle.setPerimeter(2 * PI * circle.getRadius());
        circle.setSurface(2 * PI * circle.getRadius() * circle.getRadius());
    }

    @Override
    public void visitPolygon(Polygon polygon) {
        int sidesNumber;
        System.out.println("Set " + polygon.getName() + "\n");
        while (true){
            System.out.println("Please enter an integer between 3 and 8\n");
            sidesNumber = input.nextInt();
            if (sidesNumber >= 3 && sidesNumber <= 8) break;
            else System.out.println("The number entered is out of the requested range\n");
        }
        polygon.setNumberOfSide(sidesNumber);
        polygon.setType();
    }
}
