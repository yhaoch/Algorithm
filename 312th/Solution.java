public class Solution {
    public int maxCoins(int[] nums) {
        int len = nums.length;
        int[] temp = new int[len + 2];
        for (int i = 0; i < len; i++) 
            temp[i + 1] = nums[i];
        temp[0] = 1;
        temp[len + 1] = 1;
        int[][] dp = new int[len + 2][len + 2];
        return helper(1, len, temp, dp);
    }
    
    public int helper(int i, int j, int[] nums, int[][] dp) {
        if (dp[i][j] > 0) 
            return dp[i][j];
        for (int x = i; x <= j; x++) {
            dp[i][j] = Math.max(dp[i][j], helper(i, x - 1, nums, dp) + nums[i - 1] * nums[x] * nums[j + 1] + helper(x + 1, j, nums, dp));
        }
        return dp[i][j];
    }
}