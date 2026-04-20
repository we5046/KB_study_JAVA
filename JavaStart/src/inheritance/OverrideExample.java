package inheritance;

public class OverrideExample {
    public static void main(String[] args) {
//        Notification notification = new Notification();
//        notification.send();
//
//        EmailNotification emailNotification = new EmailNotification();
//        emailNotification.send();
//        SmsNotification smsNotification = new SmsNotification();
//        smsNotification.send();

        // 부모 객체에 자식을 넣었고, 자식이 overriding 했기때문에
        // notification.send는 자식 send가 나온다.
        Notification notification = new EmailNotification();
        notification.send();

        notification = new SmsNotification();
        notification.send();
    }
}
