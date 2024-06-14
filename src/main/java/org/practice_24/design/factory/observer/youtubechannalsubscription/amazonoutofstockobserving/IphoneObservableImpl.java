package org.practice_24.design.factory.observer.youtubechannalsubscription.amazonoutofstockobserving;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StockObservable{
    List<NotificationAlertObserver> observers = new ArrayList<>();
    @Override
    public void add(NotificationAlertObserver notificationAlertObserver) {
        observers.add(notificationAlertObserver);
    }

    @Override
    public void remove(NotificationAlertObserver notificationAlertObserver) {
        observers.remove(notificationAlertObserver);
    }

    @Override
    public void notifySubscribers(String title) {
        for(NotificationAlertObserver notificationAlertObserver : this.observers){
            notificationAlertObserver.update(title);
        }
    }

    /*@Override
    public void setStocksCount(int newStockCount) {

    }

    @Override
    public int getStockCount() {
        return 0;
    }*/
}
