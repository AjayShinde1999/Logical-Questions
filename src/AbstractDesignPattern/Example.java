package AbstractDesignPattern;

import java.awt.*;

interface Notification {
    void userNotify();
}

class AndroidSmsNotification implements Notification {

    @Override
    public void userNotify() {
        System.out.println("Android SMS Notification");
    }
}

class AndroidEmailNotification implements Notification {

    @Override
    public void userNotify() {
        System.out.println("Android Email Notification");
    }
}

class AndroidWhatsappNotification implements Notification {

    @Override
    public void userNotify() {
        System.out.println("Android Whatsapp Notification");
    }
}

class IOSSmsNotification implements Notification {

    @Override
    public void userNotify() {
        System.out.println("IOS SMS Notification");
    }
}

class IOSEmailNotification implements Notification {

    @Override
    public void userNotify() {
        System.out.println("IOS Email Notification");
    }
}

class IOSWhatsappNotification implements Notification {

    @Override
    public void userNotify() {
        System.out.println("IOS Whatsapp Notification");
    }
}

interface NotificationFactory {
    Notification createSmsNotification();

    Notification createEmailNotification();

    Notification createWhatsappNotification();
}

class AndroidNotificationFactory implements NotificationFactory {

    @Override
    public Notification createSmsNotification() {
        return new AndroidSmsNotification();
    }

    @Override
    public Notification createEmailNotification() {
        return new AndroidEmailNotification();
    }

    @Override
    public Notification createWhatsappNotification() {
        return new AndroidWhatsappNotification();
    }
}

class IOSNotificationFactory implements NotificationFactory {

    @Override
    public Notification createSmsNotification() {
        return new IOSSmsNotification();
    }

    @Override
    public Notification createEmailNotification() {
        return new IOSEmailNotification();
    }

    @Override
    public Notification createWhatsappNotification() {
        return new IOSWhatsappNotification();
    }
}


public class Example {
    public static void main(String[] args) {
        AndroidNotificationFactory factory = new AndroidNotificationFactory();
        makeAndroidCall(factory);

        IOSNotificationFactory iosNotificationFactory = new IOSNotificationFactory();
        makeIOSCall(iosNotificationFactory);

    }

    private static void makeIOSCall(IOSNotificationFactory factory) {
        Notification notification1 = factory.createEmailNotification();
        notification1.userNotify();

        Notification notification2 = factory.createSmsNotification();
        notification2.userNotify();

        Notification notification3 = factory.createWhatsappNotification();
        notification3.userNotify();
    }

    private static void makeAndroidCall(AndroidNotificationFactory factory) {
        Notification notification1 = factory.createEmailNotification();
        notification1.userNotify();

        Notification notification2 = factory.createSmsNotification();
        notification2.userNotify();

        Notification notification3 = factory.createWhatsappNotification();
        notification3.userNotify();
    }

}
