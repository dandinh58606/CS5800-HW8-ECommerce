public class OnlinePaymentNotification extends PaymentNotification{

    public OnlinePaymentNotification(MessageChannel messageChannel){
        super(messageChannel);
    }

    @Override
    public void notifyCustomer(){
        messageChannel.sendMessage("Your online payment has gone through");
    }
}
