package recap.shapes;

import java.util.Scanner;

public class Square extends Shape {

    private double width;

    Square(){}

    public void initFromKeyboard(Scanner input){
        System.out.print("Width = ");
        this.width = input.nextInt();
    }

    @Override
    public double getArea(){
        return width * width;
    }

}
