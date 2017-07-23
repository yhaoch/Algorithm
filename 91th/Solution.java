public class Solution {
    public int numDecodings(String s) {
        if(s.length() == 0)
            return 0;
        else if(s.length() == 1){
            if(s.charAt(0) == '0')
                return 0;
            else
                return 1;
        }
        else{
            if(s.charAt(0) == '0')
                return 0;
            int [] dp = new int [s.length()];
            dp[0] = 1;
            for(int i = 1;i<s.length();i++){
                int temp = ((s.charAt(i-1) - '0') * 10 + (s.charAt(i) - '0') * 1);
                if( temp <= 26  && temp > 0 ){
                    if(s.charAt(i) == '0' && i>=2)
                        dp[i] = dp[i-2];
                    else if(temp < 10 || s.charAt(i) == '0')
                        dp[i] = dp[i-1];
                    else{ 
                        if(i < 2)
                            dp[i] = dp[i-1] + 1;
                        else
                            dp[i] = dp[i-1] + dp[i-2] * 1;
                    }
                }
                else{
                    if(s.charAt(i) == '0')
                        return 0;
                    else
                        dp[i] = dp[i-1];
                }
            }
            return dp[s.length()-1];
        }
    }
}