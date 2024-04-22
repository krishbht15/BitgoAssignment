package bitgo;

import bitgo.model.NotificationEvent;
import bitgo.model.NotificationStatus;
import bitgo.model.NotificationTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class CryptoNotificationApp {

    private List<NotificationTemplate> notificationTemplates;
    private HashMap<Integer, NotificationTemplate> idToNotificationTemplates;
    private List<NotificationEvent> notificationEvents;

    public CryptoNotificationApp() {
        notificationTemplates = new ArrayList<>();
        idToNotificationTemplates = new HashMap<>();
        notificationEvents = new ArrayList<>();
    }

    public NotificationTemplate createNotification(int currentPrice, int marketDayVolume, int intraDayHighPrice, int marketCap) {
        NotificationTemplate notificationTemplate = new NotificationTemplate(notificationTemplates.size() + 1, currentPrice, marketDayVolume, intraDayHighPrice, marketCap);
        notificationTemplates.add(notificationTemplate);
        idToNotificationTemplates.put(notificationTemplate.getId(), notificationTemplate);
        System.out.println("template created -> " + notificationTemplate);
        return notificationTemplate;
    }

    public NotificationEvent sendNotificationEmail(int id, String email) {
        NotificationTemplate notificationTemplate = idToNotificationTemplates.get(id);

        if (notificationTemplate == null) {
            System.out.println("the notification ID you're trying to send is ABSENT.");
            return null;
        }

        if (notificationTemplate.isDeleted()) {
            System.out.println("the notification ID you're trying to send is DELETED.");
            return null;
        }

        NotificationEvent notificationEvent = new NotificationEvent(notificationTemplate, email, NotificationStatus.OUTSTANDING);
        notificationEvents.add(notificationEvent);
        System.out.println("event created -> " + notificationEvent);

        return notificationEvent;
    }

    public List<NotificationTemplate> getAllNotificationTemplates() {
        return notificationTemplates.stream().filter(notificationTemplate -> !notificationTemplate.isDeleted()).collect(Collectors.toList());
    }

    public List<NotificationEvent> getAllNotificationEvent() {
        return notificationEvents.stream().filter(ne -> !ne.getNotificationTemplate().isDeleted()).collect(Collectors.toList());
    }

    public NotificationTemplate deleteNotification(int id) {
        NotificationTemplate notificationTemplate = idToNotificationTemplates.get(id);

        if (notificationTemplate == null) {
            System.out.println("the notification ID you're trying to delete is ABSENT.");
            return null;
        }

        if (notificationTemplate.isDeleted()) {
            System.out.println("the notification ID you're trying to delete is already DELETED.");
            return null;
        }

        notificationTemplate.setDeleted(true);
        System.out.println("template deleted successfully");
        return notificationTemplate;
    }
}
