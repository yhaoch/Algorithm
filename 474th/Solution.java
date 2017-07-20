public class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int [][] dp = new int [m+1][n+1];
        for(int i = 0;i<strs.length;i++){
            int num_zero = 0,num_one = 0;
            for(int l = 0;l < strs[i].length();l++){
                if(strs[i].charAt(l) == '0')
                    num_zero ++;
                else
                    num_one ++;
            }
            for(int j = m;j >=num_zero;j--){
                for(int k = n;k >= num_one;k--){
                    dp[j][k] = Math.max(dp[j - num_zero][k - num_one] + 1, dp[j][k]);
                }
            }
        }
        return dp[m][n];
    }
}