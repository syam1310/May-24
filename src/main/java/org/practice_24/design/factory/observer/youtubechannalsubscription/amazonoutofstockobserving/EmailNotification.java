package org.practice_24.design.factory.observer.youtubechannalsubscription.amazonoutofstockobserving;

public class EmailNotification implements NotificationAlertObserver{
    @Override
    public void update(String title) {
        System.out.println("Email notification \n Dear user your item is back " + title);
    }
}
