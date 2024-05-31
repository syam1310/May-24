package org.practice_24.sort;

import java.util.Arrays;

public class MergeSort {
    public static void sort(int[] arr){
        mergeSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    private static void mergeSort(int[] arr, int l, int r){
        if(l<r){
            int mid = l + (r - l)/2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid+1, r);
            mergeArray(arr, l, mid, r);
        }
    }

    private static void mergeArray(int[] arr, int l, int mid, int r) {
        int size1 = mid - l + 1;
        int size2 = r - mid;
        int[] arr1 = new int[size1];
        int[] arr2 = new int[size2];

        for (int i = 0; i < size1; i++)
            arr1[i] = arr[l + i];
        for (int j = 0; j < size2; j++)
            arr2[j] = arr[mid + 1 + j];

        int i=0, j=0;
        int k=l;

        while (i<size1 && j<size2){
            if(arr1[i] <= arr2[j]){
                arr[k] = arr1[i];
                i++;
            }else{
                arr[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i<size1){
            arr[k] = arr1[i];
            k++;i++;
        }
        while (j<size2){
            arr[k] = arr2[j];
            k++;j++;
        }
    }
}
