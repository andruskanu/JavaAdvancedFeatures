package practice.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 6, 6, 7, 8, 9, 13, 20);

        List<Integer> evenIntegers = integerList.stream().filter((i) -> {
            if (i % 2 == 0) {
                return true;
            } else {
                return false;
            }
        }).collect(Collectors.toList());

        for (Integer i : evenIntegers) {
            System.out.print(i + " ");
        }
        System.out.println();

        evenIntegers.forEach((i) -> {
            System.out.print(i + " ");
        });
        System.out.println();

        evenIntegers.forEach((i) -> System.out.print(i + " "));

        System.out.println();

        List<Integer> oddIntegers = integerList
                .stream()
                .filter((i) -> i % 2 == 1)
                .collect(Collectors.toList());

        oddIntegers.forEach(i -> System.out.print(i + " "));

        System.out.println();

        integerList
                .stream()
                .filter((i) -> i % 2 == 1)
                .forEach(oddInt -> System.out.print(oddInt + " "));
    }
}
