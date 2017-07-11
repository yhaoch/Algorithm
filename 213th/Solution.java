public class Solution {
    public int rob(int[] nums) {
        if(nums.length == 0)
            return 0;
        else if(nums.length == 1)
            return nums[0];
        else if(nums.length == 2)
            return Math.max(nums[0],nums[1]);
        else if(nums.length == 3){
            int temp = Math.max(nums[0],nums[1]);
            return Math.max(temp,nums[2]);
        }
        else{
            boolean start = false;
            boolean end = false;
            int [] dp = new int [nums.length];
            dp[0] = nums[0];
            dp[1] = Math.max(nums[0],nums[1]);
            if(dp[1] == dp[0])
                start = true;
            for(int i=2;i<nums.length;i++){
                if(dp[2] == dp[0] + nums[2])
                    start = true;
                dp[i] = Math.max(dp[i-1],dp[i-2] + nums[i]);
            }
            if(dp[nums.length-1] == dp[nums.length-3] + nums[nums.length-1]){
                end = true;
            }
            if(start == true && end == true){
                int A = dp[nums.length-1] - nums[nums.length-1];
                int B = dp[nums.length-1] - nums[0];
                int C = dp[nums.length-2];
                //System.out.println(A + " " + B + " " + C);
                int [] dp1 = new int [nums.length];
                //dp1[0] = nums[0];
                dp1[1] = nums[1];
                dp1[2] = Math.max(dp1[1],dp1[2]);
                for(int i=3;i<nums.length;i++){
                    dp1[i] = Math.max(dp1[i-1],dp1[i-2] + nums[i]);
                }
                int max = A;
                if(A < B)
                    max = B;
                if(C > max)
                    max = C;
                return Math.max(max,dp1[nums.length-1]);
            }
            else{
                return dp[nums.length-1];
            }
        }       
    }
}
