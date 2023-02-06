package oopconcepts.shapes2;

public class Shape2Main {

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(5, 10);
        System.out.println(r1.getName());
        System.out.println(r1.getArea());

        System.out.println("===============");

        Shape[] shapes = new Shape[10];

        shapes[0] = new Triangle(3,2);
        shapes[1] = new Rectangle(5,7);
        shapes[2] = new Circle(7);
        shapes[3] = new Circle(5);
        shapes[4] = new Triangle(8,6);
        shapes[5] = new Rectangle(10,12);

        for(int i = 0; i < 6; i++){
            System.out.println(shapes[i].getName() + " " + shapes[i].getArea());
        }
    }
}
