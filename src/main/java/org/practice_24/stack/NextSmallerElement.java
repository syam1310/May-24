package org.practice_24.stack;

import java.util.Stack;

public class NextSmallerElement {
    public static int[] nse(int[] arr) {
        int[] res = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            res[i] = -1;
            while (!stack.empty() && arr[stack.peek()] > arr[i]) {
                res[stack.peek()] = i;
                stack.pop();
            }
            stack.push(i);
        }
        return res;
    }
}
