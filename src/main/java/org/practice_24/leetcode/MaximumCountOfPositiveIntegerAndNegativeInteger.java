package org.practice_24.leetcode;

public class MaximumCountOfPositiveIntegerAndNegativeInteger {
    public static int maxCountOfPosAndNegNumber(int[] arr){
        int ub = upperBound(arr);
        System.out.println(ub);
        return 0;
    }
    private static int upperBound(int[] arr){
        int low = 0;
        int high = arr.length-1;
        int ans = -1;
        while (low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] <= 0){
                ans = mid;
                low = mid + 1;
            }else if(arr[mid] >= 0){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return ans;
    }
}
