public class BitcoinNotification extends PaymentNotification{

    public BitcoinNotification(MessageChannel messageChannel){
        super(messageChannel);
    }

    @Override
    public void notifyCustomer() {
        messageChannel.sendMessage("Bitcoin payment has been successfully processed.");
    }
}
