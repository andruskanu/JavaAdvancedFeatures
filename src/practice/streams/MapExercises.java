package practice.streams;

import java.util.Arrays;
import java.util.List;

public class MapExercises {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("abc", "dog", "cat", "mouse", "horse");

        strings.stream().map(i -> i.toUpperCase()).forEach(System.out::println);

        strings.stream().map(i -> i.replace('a', '*')).forEach(System.out::println);

        strings.stream().filter(i -> i.length() > 3).map(i -> i.replace('o', '7')).forEach(System.out::println);


        List<Integer> integers = Arrays.asList(6, 23, 2, 5, 15, 19, 8, 9);

        integers.stream().filter(i -> i % 2 == 0).map(i -> i * i).forEach(System.out::println);
    }
}
