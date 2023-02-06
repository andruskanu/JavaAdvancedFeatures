package oopconcepts.shapes2;

public class Circle extends Shape{

    private int radius;

    public Circle(int radius){
        this.radius = radius;
    }

    @Override
    public String getName(){
        return "Circle";
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
