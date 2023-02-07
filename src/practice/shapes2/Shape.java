package practice.shapes2;

public abstract class Shape {

    abstract String getName();
    abstract double getArea();

    public void printInfo(){
        System.out.println(getName() + " with an area of " + getArea());
    }
}
