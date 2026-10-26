public class CashonDeliveryPayment extends PaymentNotification{

    public CashonDeliveryPayment(MessageChannel messageChannel){
        super(messageChannel);
    }

    @Override
    public void notifyCustomer(){
        messageChannel.sendMessage("Your cash payment has been processed.");
    }

}