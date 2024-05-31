package org.practice_24.design.factory.builderpattern;

public class Driver {

    public static void main(String[] args) {
        System.out.println(
                new User.UserBuilder()
                        .setUserId(32)
                        .setUserName("syam")
                        .setEmailId("syam@12")
                        .build());

        System.out.println(
                User.UserBuilder.builder()
                        .setUserId(32)
                        .setUserName("syam")
                        .setEmailId("syam@12")
                        .build());
    }
}
