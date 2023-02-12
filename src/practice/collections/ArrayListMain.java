package practice.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMain {

    public static void main(String[] args) {

        List<String> stringArrayList = new ArrayList<>();
        System.out.println("stringArrayList = " + stringArrayList.size());

        stringArrayList.add("one");
        stringArrayList.add("two");
        stringArrayList.add("four");
        stringArrayList.add("five");

        System.out.println("stringArrayList = " + stringArrayList.size());

        System.out.println(stringArrayList.get(0));
        System.out.println(stringArrayList.get(2));

        System.out.println();

        stringArrayList.add(2,"three");

        for (int i = 0; i < stringArrayList.size(); i++) {
            System.out.print(stringArrayList.get(i) + " ");
        }
    }
}
