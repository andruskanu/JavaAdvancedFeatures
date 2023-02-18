package recap.shapes;

import java.util.*;

public class ShapeMain {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Map<Double, Shape> shapesMap = new TreeMap<>();
        List<Shape> shapes = new LinkedList<>();
        Set<Shape> shapesSet = new TreeSet<>();

        while (1 == 1) {
            System.out.print("Input a shape: ");
            String shape = input.nextLine();

            if (shape.equals("square")) {
                Square square = new Square();
                square.initFromKeyboard(input);
                shapes.add(square);
                shapesMap.put(square.getArea(), square);
                shapesSet.add(square);
            } else if (shape.equals("rectangle")) {
                Rectangle rectangle = new Rectangle();
                rectangle.initFromKeyboard(input);
                shapes.add(rectangle);
                shapesMap.put(rectangle.getArea(), rectangle);
                shapesSet.add(rectangle);
            } else if (shape.equals("circle")) {
                Circle circle = new Circle();
                circle.initFromKeyboard(input);
                shapes.add(circle);
                shapesMap.put(circle.getArea(), circle);
                shapesSet.add(circle);
            } else if (shape.equals("stop")) {
                break;
            }
            input.nextLine();
//            for (int i = 0; i < shapes.size(); i++) {
//                System.out.println(shapes.get(i));
//                System.out.println(shapes.get(i).getArea());
//            }
//            for (Double k : shapesMap.keySet()) {
//                System.out.println(shapesMap.get(k));
//                System.out.println(shapesMap.get(k).getArea());
//            }
            for(Shape shape1 : shapesSet){
                System.out.println(shape1);
                System.out.println(shape1.getArea());
            }
        }
    }
}

