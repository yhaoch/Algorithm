public class Solution {
    public int splitArray(int[] nums, int m) {
        int [] sum = new int [nums.length + 1];
        int [] dp = new int [nums.length + 1];

        for(int i = 0;i<nums.length;i++){
            sum[i+1] += nums[i] + sum[i];
        }
        //int avg= sum/m;
        for(int j = 0;j<nums.length;j++){
            dp[j] = sum[nums.length] - sum[j];
        }
        
        for(int i=1; i<m; i++){
            for(int j=0; j<nums.length - i; j++)
            {
                dp[j]=Integer.MAX_VALUE;
                for(int k=j+1; k<=nums.length-i; k++)
                {
                    int temp = Math.max(dp[k], sum[k]-sum[j]);
                    if(temp <= dp[j])
                        dp[j]=temp;
                    else
                        break;
                }
            }
        }
        return dp[0];
    }
    
}