package recap.shapes;

import java.util.Scanner;

public class Rectangle extends Shape {

    private double width;
    private double height;

    Rectangle(){}

    public void initFromKeyboard(Scanner input){
        System.out.print("Width = ");
        this.width = input.nextInt();
        System.out.print("Height = ");
        this.height = input.nextInt();
    }
    @Override
    public double getArea(){
        return width * height;
    }
}
