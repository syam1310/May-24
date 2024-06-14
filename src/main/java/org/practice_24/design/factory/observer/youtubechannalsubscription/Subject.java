package org.practice_24.design.factory.observer.youtubechannalsubscription;

public interface Subject {
    void subscribe(Observer ob);
    void unsubscribe(Observer ob);


    void newVideoUploaded(String title);
}
