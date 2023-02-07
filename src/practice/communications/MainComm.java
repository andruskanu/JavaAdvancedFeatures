package practice.communications;

public class MainComm {

    public static void main(String[] args) {

        ConsoleSender sender1 = new ConsoleSender();
        ConsoleReceiver receiver1 = new ConsoleReceiver();

        System.out.println("<------------- try sending a message ------------->");

        boolean messageWasSent = sender1.sendMessage("Hello you have reached Vodafone, " +
                            "for English press 1, for French press 2, for Spanish press 3");

        if(messageWasSent){
            System.out.println("<------------- message was sent successfully ------------->");
        }else{
            System.out.println("<------------- message was NOT sent ------------->");
        }


        String receivedMessage = receiver1.receiveMessage();
        if(!receivedMessage.equals("1")){
            System.out.println("Sorry the input have entered is not correct");
        }else{
            System.out.println("Good!");
        }
    }
}
