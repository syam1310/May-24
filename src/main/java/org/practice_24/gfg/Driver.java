package org.practice_24.gfg;

public class Driver {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 4, 5, 2, 3, 6};
        //int k = 3;
        //System.out.println(MaximumOfAllSubarraysOfSizek.max_of_subarrays(arr, k));

//        int[] a = {6, 8, 8, 8, 9, 11, 13, 13, 15, 18, 19};
//        int k = 10;
//        System.out.println(FindTheClosestNumber.findClosest(k, a));

        /*int[] a1 = {3, 2, 2, 3, 1, 1, 1, 3};
        int k = 1;
        System.out.println(YouAndYourBooks.maxBooks(a1, k));*/

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] brr1 = {5, 4, 3, 2, 1};
        int x = 3;
        int y = 3;

        System.out.println(MaximumTipCalculator.maxTip(arr1.length, x, y, arr1, brr1));
    }
}
