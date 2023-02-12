package practice.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// read a list of strings until the user inputs the string "THE END"
// display if it contains "orange"

public class Ex2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<String> stringsList = new ArrayList<>();

        String userInput = sc.nextLine();
        while (!userInput.contains("the end")) {
            stringsList.add(userInput);
            userInput = sc.nextLine();
        }
        System.out.println("Does my stringsList contain 'orange'? -> " + stringsList.contains("orange"));
    }
}
