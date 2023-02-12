package practice.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// read a list of 5 integers
// display the sum of all integers read

public class Ex3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> listOfIntegers = new ArrayList<>();
        int sum = 0;
        System.out.println("Insert the numbers");
        for (int i = 0; i < 5; i++) {
            System.out.print("listOfIntegers[" + i + "] = ");
            listOfIntegers.add(i, sc.nextInt());
            sum = sum + listOfIntegers.get(i);
        }
        System.out.println("The sum of all integers is : " + sum);
    }
}
