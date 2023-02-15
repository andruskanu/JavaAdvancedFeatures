package practice.collections;

import practice.animals.Cat;
import java.util.HashMap;
import java.util.Map;

public class HashMapMain2 {

    public static void main(String[] args) {

        Map<Integer, Cat> cats = new HashMap<>();

        Cat cat1 = new Cat("Katia", 22);
        Cat cat2 = new Cat("Martina", 8);
        Cat cat3 = new Cat("Lilou", 31);
        Cat cat4 = new Cat("Dali", 12);

        cats.put(cat1.getId(), cat1);
        cats.put(cat2.getId(), cat2);
        cats.put(cat3.getId(), cat3);
        cats.put(cat4.getId(), cat4);

        int biggestId = Integer.MIN_VALUE;
        int smallestId = Integer.MAX_VALUE;

        for (Integer key : cats.keySet()) {
            System.out.print(key + " ");
            System.out.println(cats.get(key).getName());
            if (biggestId < key) {
                biggestId = key;
            }
            if (smallestId > key) {
                smallestId = key;
            }
        }
        System.out.println("Biggest id is: " + biggestId);
        System.out.println("Smallest id is: " + smallestId);

        int maxLength = Integer.MIN_VALUE;
        int minLength = Integer.MAX_VALUE;

        Cat shortestNameCat = null;
        Cat longestNameCat = null;

        for (Cat c : cats.values()) {
            Integer currentLength = c.getName().length();
            if(currentLength > maxLength){
                maxLength = currentLength;
                longestNameCat = c;
            }
            if(currentLength < minLength){
                minLength = currentLength;
                shortestNameCat = c;
            }
        }
        System.out.println("Largest name is: " + longestNameCat.getName() +
                " with " + maxLength + " characters.");
        System.out.println("Shortest name is: " + shortestNameCat.getName() +
                " with " + minLength + " characters.");
    }
}




