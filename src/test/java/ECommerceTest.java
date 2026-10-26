import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ECommerceTest{

    @Test
    void testEmailChannelSendMessage()
    {
        EmailChannel channelTest = new EmailChannel();

        assertDoesNotThrow(() -> channelTest.sendMessage("Test Message"));
    }

    @Test
    void testOnlineNotifPassesMessage()
    {
        MessageChannel mockChannel = new SmsChannel();
        PaymentNotification mockNotif = new OnlinePaymentNotification(mockChannel);

        mockNotif.notifyCustomer();

        assertEquals("Your online payment has gone through", mockChannel.getLastMessage());
    }

    @Test
    void testCashNotifPassesMessage()
    {
        MessageChannel mockMessageChannel = new EmailChannel();
        PaymentNotification mockNotification = new CashonDeliveryPayment(mockMessageChannel);

        mockNotification.notifyCustomer();

        assertEquals("Your cash payment has been processed.", mockMessageChannel.getLastMessage());

    }

}
