package org.practice_24.design.factory.observer.youtubechannalsubscription.amazonoutofstockobserving;

public class MobileNotification implements NotificationAlertObserver{
    @Override
    public void update(String title) {
        System.out.println("Mobile Notification \n Dear User is item is back"+ title);
    }
}
