package org.practice_24.gfg;

public class FindTheClosestNumber {
    public static int findClosest(int k, int[] arr) {
        int maxDiff = Math.abs(arr[0] - k);
        int ans = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int diff = Math.abs(arr[i] - k);
            if (diff < maxDiff) {
                maxDiff = diff;
                ans = arr[i];
            } else if (diff == maxDiff) {
                ans = Math.max(ans, arr[i]);
            }
        }
        return ans;
    }
}
