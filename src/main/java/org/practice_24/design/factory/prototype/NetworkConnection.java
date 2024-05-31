package org.practice_24.design.factory.prototype;

public class NetworkConnection implements Cloneable{
    private String ip;
    private String importantData;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getImportantData() {
        return importantData;
    }

    public void setImportantData(String importantData) {
        this.importantData = importantData;
    }

    public void loadImportantData() throws InterruptedException {
        Thread.sleep(10000);
        this.importantData = "Very very important data";
    }

    @Override
    public String toString() {
        return "NetworkConnection{" +
                "ip='" + ip + '\'' +
                ", importantData='" + importantData + '\'' +
                '}';
    }
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
