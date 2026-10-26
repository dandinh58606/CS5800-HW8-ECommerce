public interface MessageChannel {

    void sendMessage (String message);
    String getLastMessage();
}
