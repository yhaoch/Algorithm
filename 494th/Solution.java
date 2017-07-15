public class Solution {
    public int findTargetSumWays(int[] nums, int S) {
        if(nums.length == 0)
            return 0;
        else if(nums.length == 1){
            if(nums[0] == S || nums[0] + S == 0)
                return 1;
            else
                return 0;
        }
        else{
            return helper(nums,S,0,0);
        }
    }
    public int helper(int[] nums,int S,int idx,int sum){
        int ans = 0;
        if(idx == nums.length){
            if(sum == S){
                ans ++;
            }
            
            return ans;
        }
        ans += helper(nums, S, idx + 1, sum + nums[idx]);
        ans += helper(nums, S, idx + 1, sum - nums[idx]);
        return ans;
    }
}
