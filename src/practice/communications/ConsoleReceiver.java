package practice.communications;

import java.util.Scanner;

public class ConsoleReceiver implements Receiver {

    @Override
    public String getReceptionChannel() {
        return "Console";
    }

    @Override
    public String receiveMessage() {
        Scanner sc = new Scanner(System.in);
        String message = sc.nextLine();
        return message;
    }
}
