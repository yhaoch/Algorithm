public class Solution {
    public int maxSubArray(int[] nums) {
        //consider the subproblem and the connections bewtween the subpro and problem
        //maxSubArray(A, i) = maxSubArray(A, i - 1) > 0 ? maxSubArray(A, i - 1) : 0 + A[i];
        if(nums.length == 0)
            return 0;
        int [] dp = new int [nums.length];
        dp[0] = nums[0];
        int max = dp[0];
        //the connections
        for(int i=1;i<nums.length;i++){
            if(dp[i-1] > 0){
                dp[i] = dp[i-1] + nums[i];
                max = Math.max(dp[i],max);
            }
            else{
                dp[i] = nums[i];
                max = Math.max(dp[i],max);
            }
        }
        return max;
    }
}
