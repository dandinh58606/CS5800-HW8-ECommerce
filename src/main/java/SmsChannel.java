public class SmsChannel implements MessageChannel{

    @Override
    public void sendMessage(String message){
        System.out.println(message);
    }

}
