public class Solution {
    public int minSteps(int n) {
        if( n == 1)
            return 0;
        if( n ==2 )
            return 2;
        else{
            int [] dp = new int [n+1];
            dp[1] = 0;
            dp[2] = 2;
            dp[3] = 3;
            boolean [] tf = new boolean[n+1];
            for(int i= 4;i<=n;i++){
                tf[i] = isPrime(i,dp);
            }
            if(tf[n] == false)
                return n;
            else{
                // int temp = dp[n];
                // System.out.print(n + " " +temp);
                // int mult = n / temp;
                return dp[n];
            }
        }
    }
    public boolean isPrime(int n, int [] arr){
        int i = n / 2;
        int mult = 0;
        while(i>=2){   
            if(n % i == 0){
                mult  = n / i;
                arr[n] = arr[i] + mult;
                return true;
            }
            i --; 
        }
        arr[n] = n;
        return false;
    }
}