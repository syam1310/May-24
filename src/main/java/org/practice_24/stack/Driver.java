package org.practice_24.stack;

import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
        int[] height = {2,1,5,6,2,3};
        //System.out.println(LargestRectangleInHistogram.largestRectangleHistogram(height));
        System.out.println(Arrays.toString(NextGreaterElement.nge(height)));
        System.out.println(Arrays.toString(NextSmallerElement.nse(height)));
        System.out.println(Arrays.toString(PerviousGreaterElement.pge(height)));
        System.out.println(Arrays.toString(PerviousSmallerElement.pse(height)));
    }
}
