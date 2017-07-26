public class Solution {
    public int longestPalindromeSubseq(String s) {
        if(s.length() == 1)
            return 1;
        int n = s.length();
        int [][] dp = new int [n][n];
        //Arrays.fill(dp,0);
        for (int[] row : dp)
            Arrays.fill(row, 0);
        for(int i = 0;i<n;i++){
            dp[i][i] = 1;
        }
        for(int len = 1;len<n;len++){
            for(int i = 0;i<n-len;i++){
                if(s.charAt(i) == s.charAt(i+len))
                    dp[i][i+len] = 2 + dp[i+1][i+len-1];
                else{
                    dp[i][i+len] = Math.max(dp[i+1][i+len],dp[i][i+len-1]);
                }
            }
        }
        return dp[0][n-1];
    }
}