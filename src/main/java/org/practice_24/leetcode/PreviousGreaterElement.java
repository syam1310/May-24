package org.practice_24.leetcode;

import java.util.Stack;

public class PreviousGreaterElement {
    public static int[] pge(int[] arr) {
        int[] res = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            res[i] = -1;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[i] < arr[j]) {
                    res[i] = j;
                    break;
                }
            }
        }
        return res;
    }

    public static int[] pgeStack(int[] arr) {
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
