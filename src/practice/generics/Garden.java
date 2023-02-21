package practice.generics;

public interface Garden<E> {

    void addElement(E element);

    E hardestToCareFor();

}
