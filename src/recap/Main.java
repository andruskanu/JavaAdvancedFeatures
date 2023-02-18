package recap;

public class Main {

    public static void main(String[] args) {

        Point2D point2D = new Point2D(6,8);
        Point3D point3D = new Point3D(3, 4, 5);

        point2D.setXY(10,20);
        System.out.println(point2D);
        point3D.setXYZ(5,15,30);
        System.out.println(point3D);

        System.out.println("=========================================");

        int arrOne[], arrTwo[];

        CompareArrays obj1 = new CompareArrays();
        CompareArrays obj2 = new CompareArrays();

        arrOne = obj1.fillArrayOne();
        arrTwo = obj2.fillArrayTwo();

        obj1.checkArray(arrOne);
        obj2.checkArray(arrTwo);

        for (int i = 0; i < arrOne.length; i++) {
            if (arrOne[i] == arrTwo[i]) {
                System.out.print(arrOne[i] + " ");
            }
        }
    }
}