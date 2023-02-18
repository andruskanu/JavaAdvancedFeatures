package recap.shapes;

public abstract class Shape implements Comparable<Shape>{

    @Override
    public int compareTo(Shape shape){
        if(this.getClass() != shape.getClass()){
            return -1;
        }
        if(this.getArea() > shape.getArea()){
            return 1;
        }else if(this.getArea() < shape.getArea()){
            return -1;
        }else{
            return 0;
        }
    }

    public abstract double getArea();

}
