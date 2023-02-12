package practice.collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListMain {

    public static void main(String[] args) {

        List<String> stringLinkedList = new LinkedList<>();

        stringLinkedList.add("patru");
        stringLinkedList.add("trei");
        stringLinkedList.add("doi");
        stringLinkedList.add("patru");
        stringLinkedList.add("patru");
        stringLinkedList.add("patru");
        stringLinkedList.add("patru");

        System.out.println(stringLinkedList);
        String firstWord = stringLinkedList.get(0);
        int counter = 0;
        for (int i = 0; i < stringLinkedList.size(); i++) {
            String curentWord = stringLinkedList.get(i);
            if (firstWord.equals(curentWord)) {
                counter++;
            }
        }
        System.out.println("Primul cuvant este " + stringLinkedList.get(0) +
                " si apare de " + counter + " ori.");
    }
}

