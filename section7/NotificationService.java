package section7;

public class NotificationService {
    public static void main(String args[]){
        NotificationFactory nf = new NotificationFactory();
        Notification notification=nf.createNotification("SMS");
        notification.notifyUser();
    }
}
