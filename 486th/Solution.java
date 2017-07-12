public class Solution {
    // public boolean PredictTheWinner(int[] nums) {
    //     if(nums.length <= 2)
    //         return true;
    //     int i = 0,j = nums.length-1;
    //     int [] dp = new int [nums.length];
    //     int count = 2;
    //     dp[0] = Math.max(nums[0],nums[nums.length-1]);
    //     if(dp[0] == nums[0] ){
    //         dp[1] = Math.max(nums[1],nums[nums.length-1]);
    //         if(dp[1] == nums[1])
    //             i = 2;
    //         if(dp[1] == nums[nums.length-1] && dp[1] != nums[1]);
    //             j = nums.length-2;
    //     }
    //     if(dp[0] == nums[nums.length-1] && dp[0] != nums[0]){
    //         dp[1] = Math.max(nums[0],nums[nums.length-2]);
    //         if(dp[1] == nums[0])
    //             i = 1;
    //         if(dp[1] == nums[nums.length-2] && dp[1] != nums[0]);
    //             j = nums.length-3;
    //     }
    //     while(i <= j){
    //         int temp = Math.max(nums[i],nums[j]);
    //         dp[count] = dp[count-2] + temp;
    //         if(temp == nums[i])
    //             i++;
    //         if(temp == nums[j] && temp != nums[i])
    //             j--;
    //         count ++;
    //     }
    //     if((count-1) % 2 == 0){
    //         System.out.println(dp[count-1]);
    //         if(dp[count-1] >= dp[count-2])
    //             return true;
    //         else
    //             return false;
    //     }
    //     else{
    //         System.out.println(dp[count-1] + " " + dp[count-2]);
    //         if(dp[count-1] > dp[count-2])
    //             return false;
    //         else
    //             return true;
    //     }
    // }
    public boolean PredictTheWinner(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++) { 
            dp[i][i] = nums[i]; 
        }
        for (int len = 1; len < n; len++) {
            for (int i = 0; i < n - len; i++) {
                int j = i + len;
                dp[i][j] = Math.max(nums[i] - dp[i + 1][j], nums[j] - dp[i][j - 1]);
            }
        }
        return dp[0][n - 1] >= 0;
    }
}