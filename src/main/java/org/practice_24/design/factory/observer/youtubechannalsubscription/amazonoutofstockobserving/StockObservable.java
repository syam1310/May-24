package org.practice_24.design.factory.observer.youtubechannalsubscription.amazonoutofstockobserving;

public interface StockObservable {
    void add(NotificationAlertObserver notificationAlertObserver);

    void remove(NotificationAlertObserver notificationAlertObserver);

    void notifySubscribers(String title);

    /*void setStocksCount(int newStockCount);

    int getStockCount();*/
}
