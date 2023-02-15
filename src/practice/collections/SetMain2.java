package practice.collections;

import practice.animals.Dog;
import java.util.Set;
import java.util.TreeSet;

public class  SetMain2 {

    public static void main(String[] args) {

        Set<Dog> dogs = new TreeSet<>();

        Dog dog1 = new Dog("Pluto", 4);
        Dog dog2 = new Dog("Max", 15);
        Dog dog3 = new Dog("Rex", 7);
        Dog dog4 = new Dog("Ares", 51);

        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);
        dogs.add(dog4);

        for (Dog d : dogs) {
            System.out.println(d.getName());
        }
    }
}