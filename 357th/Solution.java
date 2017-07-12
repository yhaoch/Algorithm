public class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n == 0)
            return 1;
        else if(n == 1)
            return 10;
        else if( n ==2 )
            return 91;
        else{
            int [] dp = new int [n+1];
            int res = 9;
            dp[1] = 10;
            dp[2] = 91;
            for(int i=2;i<=n;i++){
                res*=(11-i);
                dp[i] = dp[i-1] + res;
            }
            return dp[n];
        }
    }
}
