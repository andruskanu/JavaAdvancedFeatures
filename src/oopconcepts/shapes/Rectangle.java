package oopconcepts.shapes;

import oopconcepts.shapes.enums.ShapeType;

public class Rectangle extends Shape {

    int length;

    public Rectangle(int length, int base, ShapeType shapeType) {
        super(base);
        this.length = length;
        this.shapeType = shapeType;
    }

    @Override
    public Integer getArea() {
        return length * base;
    }

    @Override
    public String toString() {
        return "Rectangle: " +
                "Area = " + getArea();
    }
}
