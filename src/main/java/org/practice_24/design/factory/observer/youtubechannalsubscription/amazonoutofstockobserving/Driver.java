package org.practice_24.design.factory.observer.youtubechannalsubscription.amazonoutofstockobserving;

public class Driver {
    public static void main(String[] args) {
        StockObservable stockObservable = new IphoneObservableImpl();

        
        stockObservable.add(new EmailNotification());
        stockObservable.add(new MobileNotification());

        stockObservable.notifySubscribers("Your Iphone is available in the stock!");
    }
}
