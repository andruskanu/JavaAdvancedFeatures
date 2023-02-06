package oopconcepts.shapes;

import oopconcepts.shapes.enums.ShapeType;

public class Shape {

    public int base;
    public String color;
    ShapeType shapeType;

    public Shape(int base) {
        this.base = base;
        this.color = "black";
    }

    public Shape(int base, String color, ShapeType shapeType) {
        this.base = base;
        this.color = color;
        this.shapeType = shapeType;
    }

    public Integer getArea() {
        return null;
    }

    public String tellMeWhatYouAre() {
        return "A " + ShapeType.GENERAL + " " + color + " shape";
    }
}
