package bitgo.model;

public class NotificationEvent {

    private NotificationTemplate notificationTemplate;
    private String email;
    private NotificationStatus notificationStatus;

    public NotificationEvent(NotificationTemplate notificationTemplate, String email, NotificationStatus notificationStatus) {
        this.notificationTemplate = notificationTemplate;
        this.email = email;
        this.notificationStatus = notificationStatus;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public NotificationStatus getNotificationStatus() {
        return notificationStatus;
    }

    public void setNotificationStatus(NotificationStatus notificationStatus) {
        this.notificationStatus = notificationStatus;
    }

    public NotificationTemplate getNotificationTemplate() {
        return notificationTemplate;
    }

    public void setNotificationTemplate(NotificationTemplate notificationTemplate) {
        this.notificationTemplate = notificationTemplate;
    }

    @Override
    public String toString() {
        return "NotificationEvent{" +
                "notificationTemplate=" + notificationTemplate +
                ", email='" + email + '\'' +
                ", notificationStatus=" + notificationStatus +
                '}';
    }
}
