package org.practice_24.leetcode.stackandqueue;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueue {
    Queue<Integer> queue;

    public ImplementStackUsingQueue() {
        queue = new LinkedList<>();
    }

    public void push(int x) {
        queue.add(x);
    }

    public int pop() {
        Queue<Integer> q = new LinkedList<>();
        while (queue.size() > 1) q.add(queue.poll());
        int num = queue.poll();
        while (!q.isEmpty()) queue.add(q.poll());
        return num;
    }

    public int peek() {
        Queue<Integer> q = new LinkedList<>();
        while (queue.size() > 1) q.add(queue.poll());
        int num = queue.poll();
        while (!q.isEmpty()) queue.add(q.poll());
        queue.add(num);
        return num;
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}
