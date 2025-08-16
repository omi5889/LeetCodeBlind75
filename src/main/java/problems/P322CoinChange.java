package problems;

import java.util.Arrays;

public class P322CoinChange {
    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        int[] dp = new int[amount+1];
        Arrays.fill(dp, amount+1);
        dp[0] = 0;
        for(int i=0; i<=amount; i++) {
            for (int coin : coins) {
                if (coin <= i) {
                    dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
                } else {
                    break;
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }
}
