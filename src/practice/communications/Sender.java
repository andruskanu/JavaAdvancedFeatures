package practice.communications;

public interface Sender {

    String getDestinationChannel();

    boolean sendMessage(String message);

    int getMaximLength();

    boolean isOpen();
}
