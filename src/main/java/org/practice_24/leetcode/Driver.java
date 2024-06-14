package org.practice_24.leetcode;

public class Driver {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 5, 6, 4};

        //System.out.println(FindPeakElement.findPeekEleIndex(arr));

        int[][] mat = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 20;
        //System.out.println(Arrays.toString(SearchA2DMatrix.searchIn2DMatrix(mat, target)));

//        int[] arr3 = {-3,-2,-1,0,0,1,2};
//        MaximumCountOfPositiveIntegerAndNegativeInteger.maxCountOfPosAndNegNumber(arr3);

        int a = 2, b = 8;
        //System.out.println(Power.myPow(a, b));

        int[] arr00 = {-2, -3, 4, -1, -2, 1, 5, -3};
        int[] res = KadancesAlgo.maxSubArray(arr00);
        //System.out.println("maxSum: "+res[0] +" StatIndex: "+res[1]+" EndIndex: "+res[2]);

        int[] a4 = {3, 2, 3, 1, 2};
        //System.out.println(MooresVotingAlgo.maxFreqency(a4));
        int m = 3;
        int n = 3;
        int[][] ops = {{2, 2}, {3, 3}};
        //System.out.println(RangeAdditionII.maximumCount(m,n,ops));

        int[] arr0 = {1, 1, 1, 1, 1, 1, 1, 1};
        //System.out.println(SubArray.subArray(arr0));

        //System.out.println(MinimumSizeSubarraySum.maxSizeSubArraySum(arr, 11));

        String s = "(){}[]";
        //System.out.println(ValidParenthesis.isValidParenthesis(s));

        String[] words = {"i", "love", "leetcode", "i", "love", "coding"};
        int k = 2;
        //System.out.println(TopKFrequentWords.topKFrequentEle(words, k));

        String str = "loveleetcode";
        //System.out.println(FirstUniqueCharacterInAString.getIndexOfFirstUniqueCharacterInAString(str));


        int[] ints = {2, 3, 4};
        //System.out.println(Subsets.allSubsets(ints));

        // Pascal Triangle
        //System.out.println(PascalTriangle.pt(4));

        // calculate NCR
        //System.out.println(CalculateNCR.calculateNCR(5, 2));

        int[] arr03 = {5, 2, 6, 1};
        //System.out.println(CountOfSmallerNumbersAfterSelf.countSmaller(arr03));

        String s4 = "1101";
        //System.out.println(NuberOfStepsToReduceOne.numSteps(s4));

        int[] narr = {2, 3, 1, 6, 7};
        //System.out.println(Arrays.toString(NextGreaterElement.ngeStack(narr)));
        //System.out.println(Arrays.toString(NextSmallerElement.nseStack(narr)));
        //System.out.println(Arrays.toString(PreviousGreaterElement.pgeStack(narr)));
        //System.out.println(Arrays.toString(PreviousSmallerElement.pseStack(narr)));

        // Valid Sudoku

        String s1 = "coaching";
        String t = "coding";

        //System.out.println(AppendCharactersToStringToMakeSubsequence.appendCharacters(s1, t));

        String[] emails = {"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        //System.out.println(UniqueEmailAddresses.numOfUniqueEmails(emails));

        int[] arr3e = {3,1,2,1,2,7};
        System.out.println(MinimumIncrementToMakeArrayUnique.minIncrementForUnique(arr3e));

    }
}
