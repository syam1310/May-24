package org.practice_24.leetcode;

import java.util.TreeMap;

public class LongestContinuousSubarrayWithAbsoluteDiffLessThanOrEqualToLimit {

    /*Given an array of integers nums and an integer limit, return the size of the longest non-empty subarray such that the absolute difference between any two elements of this subarray is less than or equal to limit.

    Example 1:

    Input: nums = [8,2,4,7], limit = 4
    Output: 2
    Explanation: All subarrays are:
            [8] with maximum absolute diff |8-8| = 0 <= 4.
            [8,2] with maximum absolute diff |8-2| = 6 > 4.
            [8,2,4] with maximum absolute diff |8-2| = 6 > 4.
            [8,2,4,7] with maximum absolute diff |8-2| = 6 > 4.
            [2] with maximum absolute diff |2-2| = 0 <= 4.
            [2,4] with maximum absolute diff |2-4| = 2 <= 4.
            [2,4,7] with maximum absolute diff |2-7| = 5 > 4.
            [4] with maximum absolute diff |4-4| = 0 <= 4.
            [4,7] with maximum absolute diff |4-7| = 3 <= 4.
            [7] with maximum absolute diff |7-7| = 0 <= 4.
    Therefore, the size of the longest subarray is 2.*/

    // Approach : Multiset

    /*Intuition
    If we could use a single data structure that can retrieve the maximum and minimum values in constant time, we could reduce the space complexity of our solution. Fortunately, multisets are capable of maintaining elements in sorted order, allowing us to efficiently retrieve both the maximum and minimum values in constant time.

    Using a multiset, we can efficiently track elements within the current window. Inserting and removing elements take logarithmic time, while finding the maximum and minimum values is constant time, as they are at the ends of the sorted container. A multiset, unlike a set, allows multiple instances of the same element and can be thought of as a combination of a min heap and a max heap.

    Algorithm
    Initialization:
    Initialize a multiset, window.
    Initialize left to 0 to represent the start of the sliding window.
    Initialize maxLength to 0 to store the length of the longest valid subarray.
    Iterate through the array nums from left to right using a variable right:
    For each element nums[right]:
    Add nums[right] to the window.
            Check if the current window exceeds the limit:
    While the absolute difference between the maximum value in window and the minimum value in window is greater than limit:
    Move the left pointer to the right to exclude the element causing the violation:
    Remove nums[left] from the window.
    Increment left by 1.
    Update maxLength:
    Set maxLength to the maximum of maxLength and the length of the current window, (right - left + 1).
    Return maxLength which stores the length of the longest valid subarray.*/


    public static int longestSubarray(int[] nums, int limit) {
        TreeMap<Integer, Integer> window = new TreeMap<>();
        int left = 0;
        int maxLength = 0;
        for (int right = 0; right < nums.length; right++) {
            window.put(nums[right], window.getOrDefault(nums[right], 0) + 1);


            while (window.lastKey() - window.firstKey() > limit) {
                window.put(nums[left], window.get(nums[left]) - 1);
                if (window.get(nums[left]) == 0) {
                    window.remove(nums[left]);
                }
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
