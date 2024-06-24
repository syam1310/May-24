package org.practice_24.stack;

import java.util.Arrays;
import java.util.Stack;

public class LargestRectangleInHistogram {
    public static int largestRectangleHistogram(int[] height) {
        int[] nse = nextSmallerElement(height);
        int[] pse = periousSmallerElement(height);
       int maxArea = Integer.MIN_VALUE;
       for(int i=0; i<height.length; i++){
           int width = 0;
           if(nse[i] == -1 && pse[i] == -1){
               width = height.length;
           }else if(nse[i] == -1){
               width = height.length - pse[i] - 1;
           }else if(pse[i] == -1){
               width = nse[i];
           }else{
               width = nse[i] - pse[i] - 1;
           }
           maxArea = Math.max(maxArea, height[i] * width);
       }
        return maxArea;
    }

    private static int[] nextSmallerElement(int[] arr) {
        int[] res = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            res[i] = -1;
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                res[st.peek()] = i;
                st.pop();
            }
            st.push(i);
        }
        return res;
    }

    private static int[] periousSmallerElement(int[] arr) {
        int[] res = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            res[i] = -1;
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                res[st.peek()] = i;
                st.pop();
            }
            st.push(i);
        }
        return res;
    }
}
