package oopconcepts.shapes2;

public class Triangle extends Shape{

    private int base;
    private int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public String getName() {
        return "Triangle";
    }

    @Override double getArea() {
        return base * height /2;
    }
}
