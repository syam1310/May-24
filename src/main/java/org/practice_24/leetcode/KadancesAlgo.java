package org.practice_24.leetcode;

public class KadancesAlgo {
    public static int maxSumSubArray(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            if (currSum > maxSum) {
                maxSum = currSum;
            }
            if (currSum < 0) {
                currSum = 0;
            }
        }
        return maxSum;
    }
    public static int[] maxSubArray(int[] arr){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int startIdx = -1;
        int endIdx = -1;

        for(int i=0; i<arr.length; i++){
            currSum += arr[i];
            if(currSum > maxSum){
                maxSum = currSum;
                endIdx = i;
            }

            if(currSum < 0){
                currSum = 0;
                startIdx = i;
            }
        }
        return new int[]{maxSum, startIdx + 1, endIdx + 1};
    }
}
