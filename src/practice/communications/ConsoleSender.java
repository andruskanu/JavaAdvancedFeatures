package practice.communications;

public class ConsoleSender implements Sender {

    private boolean consoleStatus = true;

    @Override
    public String getDestinationChannel() {
        return "Console";
    }

    @Override
    public boolean sendMessage(String message) {
        if (isOpen() && message.length() <= getMaximLength()) {
            System.out.println(message);
            return true;
        } else {
            consoleStatus = false;
            return false;
        }
    }

    @Override
    public int getMaximLength(){
        return 500;
    }

    @Override
    public boolean isOpen(){
        return consoleStatus;
    }
}
