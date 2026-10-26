public class EmailChannel implements MessageChannel{

    private String lastMessage;

    @Override
    public void sendMessage(String message){
        this.lastMessage = message;
        System.out.println("Email: " + lastMessage);
    }

    public String getLastMessage(){
        return lastMessage;
    }

}
