package oopconcepts.shapes;

import oopconcepts.shapes.enums.ShapeType;

public class Triangle extends Shape {

    int height;

    public Triangle(int height, int base) {
        super(base);
        this.height = height;
    }

    public Triangle(int height, int base, String color) {
        super(base, color, ShapeType.TRIANGLE);
        this.height = height;
    }

    @Override
    public Integer getArea() {
        return (height * super.base) / 2;
    }

    @Override
    public String toString() {
        return "Triangle: " +
                "Area = " + getArea();
    }

    @Override
    public String tellMeWhatYouAre() {
        return "A " + color + " " + ShapeType.TRIANGLE;
    }
}
