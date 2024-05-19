package org.practice_24.gfg;

import java.util.ArrayList;
import java.util.List;

public class MaximumOfAllSubarraysOfSizek {
    /*Given an array arr[] of size N and an integer K. Find the maximum for each and every contiguous subarray of size K.

    Example 1:

    Input:
    N = 9, K = 3
    arr[] = 1 2 3 1 4 5 2 3 6
    Output:
            3 3 4 5 5 5 6
    Explanation:
            1st contiguous subarray = {1 2 3} Max = 3
            2nd contiguous subarray = {2 3 1} Max = 3
            3rd contiguous subarray = {3 1 4} Max = 4
            4th contiguous subarray = {1 4 5} Max = 5
            5th contiguous subarray = {4 5 2} Max = 5
            6th contiguous subarray = {5 2 3} Max = 5
            7th contiguous subarray = {2 3 6} Max = 6*/

    public static List<Integer> max_of_subarrays(int arr[],int k){
        int i=0;
        int j=k-1;

        int n = arr.length;
        List<Integer> res = new ArrayList<>();
        while (j<n){
            int max = 0;
            for(int x=i; x<=j; x++){
                max = Math.max(max, arr[x]);
            }
            res.add(max);
            i++; j++;
        }
        return res;
    }
}
