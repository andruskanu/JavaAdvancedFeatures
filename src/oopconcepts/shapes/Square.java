package oopconcepts.shapes;

import oopconcepts.shapes.enums.ShapeType;

public class Square extends Shape {

    public Square(int base) {
        super(base);
    }

    public Square(int base, String color) {
        super(base, color, ShapeType.SQUARE);
    }

    @Override
    public Integer getArea() {
        return super.base * super.base;
    }

    @Override
    public String toString() {
        return "Square: " +
                "Area = " + getArea();
    }
}
