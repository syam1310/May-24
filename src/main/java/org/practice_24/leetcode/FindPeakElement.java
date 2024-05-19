package org.practice_24.leetcode;

public class FindPeakElement {

    /*A peak element is an element that is strictly greater than its neighbors.

    Given a 0-indexed integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.

    You may imagine that nums[-1] = nums[n] = -∞. In other words, an element is always considered to be strictly greater than a neighbor that is outside the array.

    You must write an algorithm that runs in O(log n) time.



    Example 1:

    Input: nums = [1,2,3,1]
    Output: 2
    Explanation: 3 is a peak element and your function should return the index number 2.*/
    public static int findPeekIndex(int[] arr) {
        if (arr.length == 1) return 0;

        int ans = -1;
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                ans = i;
                break;
            }
        }
        if (ans == -1) {
            if (arr[arr.length - 2] < arr[arr.length - 1]) {
                ans = arr.length - 1;
            } else if (arr[0] > arr[1]) {
                ans = 0;
            }
        }
        return ans;
    }

    public static int findPeekEleIndex(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}
