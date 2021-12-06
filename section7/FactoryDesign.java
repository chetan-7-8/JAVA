package section7;

public class FactoryDesign {
   /* It is a creational design pattern which talks about the creation of an object.
    The factory design pattern says that define an interface (or an abstract class)
    and let the subclasses decide which object to instantiate
    */

}

interface Notification{
     void notifyUser();
}

class CliqNotification implements Notification{

    @Override
    public void notifyUser() {
        System.out.println("Sending an Cliq notification");

    }
}


class SMSNotification implements Notification{

    @Override
    public void notifyUser() {
        System.out.println("Sending an SMS notification");
    }
}

class EmailNotification implements Notification{

    @Override
    public void notifyUser() {
        System.out.println("Sending an Email notification");

    }
}


