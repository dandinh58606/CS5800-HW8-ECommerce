public class SmsChannel implements MessageChannel{

    private String lastMessage;

    @Override
    public void sendMessage(String message){
        this.lastMessage = message;
        System.out.println("SMS: " + lastMessage);
    }

    public String getLastMessage(){
        return lastMessage;
    }

}
