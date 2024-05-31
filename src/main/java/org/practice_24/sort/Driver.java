package org.practice_24.sort;

public class Driver {
    public static void main(String[] args) {
        int[] arr = {3, 0, 4, 1, -1, 43, 0, 4};
        BubbleSort.sort(arr);
        SelectionSort.sort(arr);
        InsertionSort.sort(arr);
        MergeSort.sort(arr);
        QuickSort.sort(arr);
    }
}
