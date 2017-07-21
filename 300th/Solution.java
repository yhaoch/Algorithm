public class Solution {
    public int lengthOfLIS(int[] nums) {
        if(nums.length == 0)
            return 0;
        if(nums.length == 1)
            return 1;
        int [] dp = new int [nums.length];
        int max = 0;
        for(int i = 1;i<nums.length;i++){
            for(int j = 0;j<i;j++){
                if(nums[j] < nums[i]){
                    dp[i] = Math.max(dp[i],dp[j] + 1);
                    if(dp[i] > max)
                        max = dp[i];
                }
            }
        }
        return max + 1;
    }
}