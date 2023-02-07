package practice.shapes;

import practice.shapes.enums.ShapeType;

public class ShapesMain {

    public static void main(String[] args) {

        Square p1 = new Square(5);

        Triangle t1 = new Triangle(5, 6);
        Triangle t2 = new Triangle(5, 6, "pink");
        Triangle t3 = new Triangle(5, 6, "blue");

        Rectangle r1 = new Rectangle(4, 2, ShapeType.RECTANGLE);

        System.out.println(p1);
        System.out.println(t1);
        System.out.println(r1);

        Shape shape = new Shape(6, "red", ShapeType.GENERAL);

        System.out.println(shape.tellMeWhatYouAre());
        System.out.println(t2.tellMeWhatYouAre());
        System.out.println(t3.tellMeWhatYouAre());
    }
}
