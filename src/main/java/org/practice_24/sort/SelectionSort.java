package org.practice_24.sort;

import java.util.Arrays;

public class SelectionSort {
    public static void sort(int[] arr){
        int minIndex = 0;
        for(int i=0; i<arr.length; i++){
            minIndex = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
