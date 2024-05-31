package org.practice_24.gfg;

public class YouAndYourBooks {
    /*You have n stacks of books. Each stack of books has some nonzero height arr[i] equal to the number of books on that stack ( considering all the books are identical and each book has a height of 1 unit ). In one move, you can select any number of consecutive stacks of books such that the height of each selected stack of books arr[i] <= k. Once such a sequence of stacks is chosen, You can collect any number of books from the chosen sequence of stacks.
    What is the maximum number of books that you can collect this way?*/

    public static int maxBooks(int[] arr, int k) {
        int sum = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= k) {
                sum += arr[i];
                if (sum > max) {
                    max = sum;
                }
            } else {
                sum = 0;
            }

        }
        return max;
    }
}
