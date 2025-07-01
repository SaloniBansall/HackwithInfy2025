
import java.util.*;

public class minimumNumberOfCoins {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

    }

    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                if (dp[i - coin] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }
        return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
    }

}

// This uses Dynamic Programming (Bottom-Up Tabulation).
// dp[i] stores the minimum number of coins needed to make amount i.
// Initialize dp[0] = 0 because no coins are needed to make amount 0.
// For each coin:
// Update dp[i] for all values from coin to amount.
// If dp[i - coin] is already computed, update dp[i] = min(dp[i], dp[i - coin] + 1).
//  Time Complexity:
// O(n * amount)
// n = number of coins
// amount = target amount

// Space Complexity = O(amount)
