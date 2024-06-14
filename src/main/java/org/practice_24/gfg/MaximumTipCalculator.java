package org.practice_24.gfg;

import java.util.Arrays;
import java.util.Comparator;

public class MaximumTipCalculator {
    public static int maxTip(int n, int x, int y, int[] arr, int[] brr){
        int[][] temp = new int[n][3];

        for(int i=0; i<n; i++){
            temp[i][0] = arr[i];
            temp[i][1] = brr[i];
            temp[i][2] = Math.abs(arr[i] - brr[i]);
        }

        Arrays.sort(temp, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[2] - o1[2];
            }
        });

        for(int i=0; i<temp.length; i++){
            System.out.println(Arrays.toString(temp[i]));
        }
        int res = 0;

        for(int i=0; i<n; i++){
            if(x == 0){
                res += temp[i][1];
            }else if(y == 0){
                res += temp[i][0];
            }else {
                if(temp[i][0] >= temp[i][1]){
                    res += temp[i][0];
                    x--;
                }else{
                    res += temp[i][1];
                    y--;
                }
            }
        }
        return res;
    }
}
