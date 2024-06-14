package org.practice_24.design.factory.observer.youtubechannalsubscription;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Driver {
    public static void main(String[] args) throws IOException {
        YoutuberChannal channal = new YoutuberChannal();
        Subscriber aman = new Subscriber("Aman");
        channal.subscribe(aman);
        channal.newVideoUploaded("Learn Design Pattern");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("Press 1 to upload video!");
            System.out.println("Press 2 to create new Subscriber");
            System.out.println("Press 3 to Unsubscribe the user");
            System.out.println("Press 4 to exit");

            int c = Integer.parseInt(br.readLine());
            if (c == 1) {
                System.out.println("enter video title ");
                String videoTitle = br.readLine();
                channal.newVideoUploaded(videoTitle);
            } else if (c == 2) {
                System.out.println("Enter the name Subscriber");
                String name = br.readLine();
                Subscriber subscriber = new Subscriber(name);
                channal.subscribe(subscriber);

            } else if (c == 3) {
                System.out.println("Enter the name to unsubscribe");
                String name = br.readLine();
                Subscriber subscriber = new Subscriber(name);
                channal.unsubscribe(subscriber);
                System.out.println("Thanks for using the app!");
            } else if (c == 4) {
                System.out.println("Thanks for using the app!");
                break;
            } else
                System.out.println("Wrong Input!");

        }

    }
}
