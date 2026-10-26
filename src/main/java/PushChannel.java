public class PushChannel implements MessageChannel{

    @Override
    public void sendMessage(String message) {
        System.out.println(message);
    }
}
