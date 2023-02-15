package practice.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetMain {

    public static void main(String[] args) {

        Set<Integer> intHashSet = new HashSet<>();
        Set<Integer> intTreeSet = new TreeSet<>();
        Set<Integer> linkedHashSet = new LinkedHashSet<>();

        intHashSet.add(4);
        intHashSet.add(21);
        intHashSet.add(8);
        intHashSet.add(32);
        intHashSet.add(71);
        intHashSet.add(-5);

        intTreeSet.add(4);
        intTreeSet.add(21);
        intTreeSet.add(8);
        intTreeSet.add(32);
        intTreeSet.add(71);
        intTreeSet.add(-5);

        linkedHashSet.add(4);
        linkedHashSet.add(21);
        linkedHashSet.add(8);
        linkedHashSet.add(32);
        linkedHashSet.add(71);
        linkedHashSet.add(-5);

        System.out.print("HashSet: ");
        for (Integer nr : intHashSet) {
            System.out.print(nr + " ");
        }
        System.out.println();

        System.out.print("TreeSet: ");
        for (Integer nr : intTreeSet) {
            System.out.print(nr + " ");
        }
        System.out.println();

        System.out.print("LinkedHashSet: ");
        for (Integer nr : linkedHashSet) {
            System.out.print(nr + " ");
        }
    }
}
