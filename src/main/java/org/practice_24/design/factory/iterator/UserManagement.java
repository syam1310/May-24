package org.practice_24.design.factory.iterator;

import java.util.ArrayList;

public class UserManagement {
    private ArrayList<User> users = new ArrayList<User>();

    public void addUser(User user){
        users.add(user);
    }
    public User getUser(int index){
        return users.get(index);
    }

    public MyIterator getIterator(){
        return new MyIteratorImple(users);
    }
}
