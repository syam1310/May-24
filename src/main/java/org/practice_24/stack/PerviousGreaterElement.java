package org.practice_24.stack;

import java.util.Stack;

public class PerviousGreaterElement {
    public static int[] pge(int[] arr) {
        int[] res = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            res[i] = -1;
            while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                res[stack.peek()] = i;
                stack.pop();
            }
            stack.push(i);
        }
        return res;
    }
}
