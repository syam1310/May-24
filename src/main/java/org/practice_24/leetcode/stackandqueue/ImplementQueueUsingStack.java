package org.practice_24.leetcode.stackandqueue;

import java.util.Stack;

public class ImplementQueueUsingStack {
    Stack<Integer> st;

    public ImplementQueueUsingStack() {
        st = new Stack<>();
    }

    public void push(int x) {
        st.push(x);
    }

    public int pop() {
        Stack<Integer> s = new Stack<>();
        while (st.size() > 1) s.push(st.pop());
        int num = st.pop();
        while (!s.isEmpty()) st.push(s.pop());
        return num;
    }

    public int peek() {
        Stack<Integer> s = new Stack<>();
        while (st.size() > 1) s.push(st.pop());
        int num = st.peek();
        while (!s.isEmpty()) st.push(s.pop());
        return num;
    }

    public boolean empty() {
        return st.isEmpty();
    }
}
