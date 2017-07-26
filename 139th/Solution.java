public class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean [] dp = new boolean [s.length() + 1];
        
        dp[0] = true;
        
        for(int i = 1;i <= s.length();i++){
            //for(int j = i-1;j>=0;j--){
            for(int j = 0;j<i;j++){
                //要知道为什么这里dp[j] == true
                if(dp[j] == true && helper(s.substring(j,i),wordDict)){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
    public boolean helper(String str,List<String> wordDict){
        boolean temp = false;
        for(int i = 0;i<wordDict.size();i++){
            if(wordDict.get(i).equals(str) == true)
                temp = true;
        }
        return temp;
    }
}