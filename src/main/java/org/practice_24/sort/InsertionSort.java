package org.practice_24.sort;

import java.util.Arrays;

public class InsertionSort {
    public static void sort(int[] arr){
        for(int i=1; i<arr.length; i++){
            int temp = arr[i],j=0;
            for(j=i-1; j>=0; j--){
                if(temp < arr[j]){
                    arr[j+1] = arr[j];
                }else{
                    break;
                }
            }
            arr[j+1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
