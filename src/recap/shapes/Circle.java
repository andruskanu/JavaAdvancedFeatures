package recap.shapes;

import java.util.Scanner;

public class Circle extends Shape {

    private double radius;

    Circle(){}

    public void initFromKeyboard(Scanner input){
        System.out.print("Radius = ");
        this.radius = input.nextInt();
    }

    @Override
    public double getArea(){
        return Math.PI * radius * radius;
    }

}
