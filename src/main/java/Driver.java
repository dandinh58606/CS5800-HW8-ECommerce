public class Driver {

    public static void main(String[] args){

        System.out.println("Part 1: General Showcase of Options Possible.");

        EmailChannel email = new EmailChannel();
        SmsChannel SMS = new SmsChannel();

        PaymentNotification onlineEmail = new OnlinePaymentNotification(email);
        onlineEmail.notifyCustomer();

        PaymentNotification onlineSMS = new OnlinePaymentNotification(SMS);
        onlineSMS.notifyCustomer();

        PaymentNotification cashEmail = new CashonDeliveryPayment(email);
        cashEmail.notifyCustomer();

        PaymentNotification cashSMS = new CashonDeliveryPayment(SMS);
        cashSMS.notifyCustomer();

        System.out.println("Part 2: Adding in new Payment method - Bitcoin.");

        PaymentNotification bitcoinEmail = new BitcoinNotification(email);
        bitcoinEmail.notifyCustomer();

        PaymentNotification bitcoinSMS = new BitcoinNotification(SMS);
        bitcoinSMS.notifyCustomer();

        System.out.println("Part 3: Adding in new message method - Push Notifications.");

        PushChannel push = new PushChannel();

        PaymentNotification onlinePush = new OnlinePaymentNotification(push);
        onlinePush.notifyCustomer();

        PaymentNotification bitcoinPush = new BitcoinNotification(push);
        bitcoinPush.notifyCustomer();


    }

}
