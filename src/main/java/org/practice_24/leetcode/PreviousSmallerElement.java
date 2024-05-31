package org.practice_24.leetcode;

import java.util.Stack;

public class PreviousSmallerElement {
    public static int[] pse(int[] arr) {
        int[] res = new int[arr.length];
        for (int j = arr.length - 1; j >= 0; j--) {
            res[j] = -1;
            for (int i = j - 1; i >= 0; i--) {
                if (arr[j] > arr[i]) {
                    res[j] = i;
                    break;
                }
            }
        }
        return res;
    }

    public static int[] pseStack(int[] arr) {
        int[] res = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            res[i] = -1;
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                res[stack.peek()] = i;
                stack.pop();
            }
            stack.push(i);
        }
        return res;
    }
}
