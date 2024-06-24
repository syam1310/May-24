package org.practice_24.leetcode;

import java.util.Arrays;

public class CoinChange {
    public static int coinChange(int[] coins, int amount) {
        int[][] dp = new int[coins.length][amount + 1];
        for (int[] arr : dp) Arrays.fill(arr, -2);
        return countCoins(coins, amount);
    }

    private static int countCoin(int[] coins, int amount, int index) {
        if (amount == 0) return 0;
        if (index < 0 || amount < 0) return -1;

        int take = countCoin(coins, amount - coins[index], index);
        if (take != -1) {
            take += 1;
        }

        int nTake = countCoin(coins, amount, index - 1);

        if (take == -1) return nTake;
        else if (nTake == -1) return take;
        else
            return Math.min(take, nTake);
    }

    private static int countCoins(int[] coins, int amount, int index, int[][] dp) {
        if (amount == 0) return 0;
        if (index < 0 || amount < 0) return -1;
        if (dp[index][amount] != -2) return dp[index][amount];

        int take = countCoins(coins, amount - coins[index], index, dp);
        if (take != -1) take += 1;
        int ntake = countCoins(coins, amount, index - 1, dp);
        if (take == -1) dp[index][amount] = ntake;
        else if (ntake == -1) dp[index][amount] = take;
        else dp[index][amount] = Math.min(take, ntake);
        return dp[index][amount];
    }

    private static int countCoins(int[] coins, int amount) {
        int[][] dp = new int[coins.length + 1][amount + 1];
        Arrays.fill(dp[0], Integer.MAX_VALUE - 1);
        dp[0][0] = 0;
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (coins[i - 1] > j) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j], 1 + dp[i][j - coins[i - 1]]);
                }
            }
        }
        int res = dp[dp.length - 1][dp[0].length - 1];
        return res == Integer.MAX_VALUE - 1 ? -1 : res;
    }
}
