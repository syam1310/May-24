package org.practice_24.design.factory.iterator;

public class Driver {
    public static void main(String[] args) {
        UserManagement userManagement = new UserManagement();
        userManagement.addUser(new User("syam","89"));
        userManagement.addUser(new User("ankit","8"));
        userManagement.addUser(new User("ranjith","9"));
        userManagement.addUser(new User("aman","890"));

       MyIterator myIterator =  userManagement.getIterator();

       while (myIterator.hasNext()){
           User user = (User) myIterator.next();
           System.out.println(user);
       }
    }
}
