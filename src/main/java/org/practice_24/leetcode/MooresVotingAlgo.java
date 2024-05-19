package org.practice_24.leetcode;

public class MooresVotingAlgo {
    public static int maxFreqency(int[] arr) {
        int freq = 1;
        int maxIdx = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[maxIdx]) {
                freq++;
            } else {
                freq--;
            }
            if (freq == 0) {
                freq = 1;
                maxIdx = i;
            }
        }
        return arr[maxIdx];
    }
}
