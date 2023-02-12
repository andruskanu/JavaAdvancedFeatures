package practice.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// read a list o 5 strings
// display if it contains "orange"

public class Ex1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<String> fruitsList = new ArrayList<>();

        System.out.println("Input fruitsList from keyboard");

        for (int i = 0; i < 5; i++) {
            System.out.print("fruitsList[" + i + "] = ");
            fruitsList.add(i, sc.nextLine());
        }
        for (int i = 0; i < fruitsList.size(); i++) {
            System.out.print(fruitsList.get(i) + " ");
        }
        System.out.println();

        System.out.println("Does my stringsList contain 'orange'? -> " + fruitsList.contains("orange"));
    }
}
