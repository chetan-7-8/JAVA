package section7;

public class NotificationFactory {
    public Notification createNotification(String medium){
        if(medium.equals("SMS")){
            return new SMSNotification();
        }
        else if(medium.equals("Cliq")){
            return new CliqNotification();
        }
        else if(medium.equals("Email")){
            return new EmailNotification();
        }
        else{
            System.out.println("Please type a valid medium");
        }
   return null; }
}
