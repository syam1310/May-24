package org.practice_24.design.factory.prototype;

public class Driver {
    public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {
        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp("198.43.56.7");
        networkConnection.loadImportantData();
        System.out.println(networkConnection);

        NetworkConnection networkConnection1 = (NetworkConnection) networkConnection.clone();
        System.out.println(networkConnection1);
    }
}
