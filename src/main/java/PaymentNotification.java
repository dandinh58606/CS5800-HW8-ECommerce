public abstract class PaymentNotification {

    protected MessageChannel messageChannel;

    public PaymentNotification(MessageChannel messageChannel){
        this.messageChannel = messageChannel;
    }

    public abstract void notifyCustomer();

}
