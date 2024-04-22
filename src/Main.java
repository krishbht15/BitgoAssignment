import bitgo.CryptoNotificationApp;
import bitgo.model.NotificationEvent;
import bitgo.model.NotificationTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CryptoNotificationApp cryptoNotificationApp = new CryptoNotificationApp();
        cryptoNotificationApp.createNotification(23,74,5,6);
        cryptoNotificationApp.createNotification(26,14,5,6);
        cryptoNotificationApp.createNotification(22,24,5,6);
        cryptoNotificationApp.createNotification(233,42,5,6);
        cryptoNotificationApp.createNotification(99,43,5,6);

        cryptoNotificationApp.sendNotificationEmail(2,"k@b.com");
        cryptoNotificationApp.sendNotificationEmail(3,"a@c.com");
        cryptoNotificationApp.sendNotificationEmail(4,"y@n.com");

        cryptoNotificationApp.deleteNotification(3);

        System.out.println(cryptoNotificationApp.getAllNotificationEvent());
    }
}