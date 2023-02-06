package oopconcepts.shapes2;

public class Rectangle extends Shape {

    private int length;
    private int width;
    public Rectangle(int width, int length){
        this.length = length;
        this.width = width;
    }

    @Override
    public String getName() {
        return "Rectangle";
    }
    @Override
    public double getArea() {
        return length * width;
    }
}
