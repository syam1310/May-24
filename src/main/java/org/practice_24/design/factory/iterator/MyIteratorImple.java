package org.practice_24.design.factory.iterator;

import java.util.List;

public class MyIteratorImple implements MyIterator{

    private List<User> list;
    private int length;
    private int position;

    public MyIteratorImple(List<User> list){
        this.list = list;
        this.length = list.size();
        this.position = 0;

    }
    @Override
    public boolean hasNext() {
        if(position >= length)return false;
        else return true;
    }

    @Override
    public Object next() {
        return list.get(position++);
    }
}
