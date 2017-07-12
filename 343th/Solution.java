public class Solution {
    public int integerBreak(int n) {
        int [] dp = new int [n + 1];
        for(int i = 1;i<n;i++){
            for(int j = i;j<n;j++)
                if(i + j <= n){
                    dp[i+j] = Math.max(dp[i+j], Math.max(dp[i],i) * Math.max(dp[j],j));
                }
        }
        return dp[n];
    }
}
