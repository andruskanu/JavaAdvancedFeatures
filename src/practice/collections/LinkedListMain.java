package practice.collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListMain {

    public static void main(String[] args) {

        List<String> stringLinkedList = new LinkedList<>();

        stringLinkedList.add("four");
        stringLinkedList.add("three");
        stringLinkedList.add("two");
        stringLinkedList.add("four");
        stringLinkedList.add("four");
        stringLinkedList.add("four");
        stringLinkedList.add("four");

        System.out.println(stringLinkedList);
        String firstWord = stringLinkedList.get(0);
        int counter = 0;
        for (int i = 0; i < stringLinkedList.size(); i++) {
            String currentWord = stringLinkedList.get(i);
            if (firstWord.equals(currentWord)) {
                counter++;
            }
        }
        System.out.println("First word is " + stringLinkedList.get(0) +
                " and it is displayed for " + counter + " times.");
    }
}

