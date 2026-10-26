public class PushChannel implements MessageChannel{

    private String lastMessage;

    @Override
    public void sendMessage(String message) {
        this.lastMessage = message;
        System.out.println("Push: " + lastMessage);
    }

    public String getLastMessage(){
        return lastMessage;
    }
}
