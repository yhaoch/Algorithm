public class Solution {
    public int numberOfArithmeticSlices(int[] A) {
        if(A.length < 3)
            return 0;
        else{
            int [] dp = new int [A.length];
            dp[0] = 0;
            dp[1] = 0;
            int res = 0;
            for(int i = 2;i< A.length;i++){
                int t1 = A[i] - A[i-1];
                int t2 = A[i-1] - A[i-2];
                if(t1 == t2){
                    dp[i] = dp[i-1] + 1;
                    res += dp[i];
                }
                else{
                    dp[i] = 0;
                }
            }
            return res;
        }
    }
}
