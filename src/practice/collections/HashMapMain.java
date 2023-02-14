package practice.collections;

import practice.animals.Dog;
import java.util.HashMap;
import java.util.Map;

public class HashMapMain {

    public static void main(String[] args) {

        Map<Integer, Dog> dogs = new HashMap<Integer, Dog>();

        Dog dog1 = new Dog("Pluto", 4);
        Dog dog2 = new Dog("Max", 15);
        Dog dog3 = new Dog("Rex", 7);
        Dog dog4 = new Dog("Ares", 51);

        dogs.put(dog1.getId(), dog1);
        dogs.put(1, dog2);
        dogs.put(dog3.getId(), dog3);
        dogs.put(dog4.getId(), dog4);

        for (Integer key : dogs.keySet()) {
            System.out.print(key + " ");
            System.out.println(dogs.get(key).getName());
        }

        for(Dog dog : dogs.values()){
            System.out.println(dog.getName());
        }
    }
}
