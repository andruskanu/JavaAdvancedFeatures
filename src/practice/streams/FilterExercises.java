package practice.streams;

import java.util.*;

public class FilterExercises {

    public static void main(String[] args) {


        List<Integer> myList = Arrays.asList(6, 27, 15, 7, 4, 11, 37, 8);
        List<Integer> myList2 = Arrays.asList(5, 21, 15, 7, 3, 11, 34, 9);

        myList.stream().filter(i -> i > 10).forEach(i -> System.out.print(i + " "));

        System.out.println();

        myList2.stream().filter(i -> {
            if (i > 10) {
                return true;
            } else {
                return false;
            }
        }).forEach(i -> System.out.print(i + " "));

        System.out.println();

        myList.stream().filter(i -> i % 10 == 7).forEach(i -> System.out.print(i + " "));

        System.out.println();

        myList.stream().filter(i -> i % 2 == 0).forEach(i -> System.out.print(i + " "));

        System.out.println("\n========================================");


        List<String> strings = Arrays.asList("mouse", "cat", "chrome", "dog", "bear");

        strings.stream().filter(i -> i.length() < 4).forEach(i -> System.out.print(i + " "));
        System.out.println();

        strings.stream().filter(i -> i.contains("o")).forEach(i-> System.out.print(i + " "));
        System.out.println();

        strings.stream().filter(i -> i.contains("e")).forEach(System.out::println);
    }
}
