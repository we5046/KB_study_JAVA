package inheritance;

public class SmsNotification extends Notification{
    public SmsNotification(){
    }

    @Override
    public void send() {
        System.out.println("SMS Notification");
    }
}
