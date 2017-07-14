public class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() > t.length()){
            return false;
        }
        if(s.length() == 0)
            return true;
        else{
            return helper(s,t);
        }
    }
    public boolean helper(String s, String t){
        if(s.length() == 0)
            return true;
        else{
            char temp = s.charAt(0);
            int i;
            boolean tag = false;
            for(i = 0;i<t.length();i++){
                if(t.charAt(i) == temp){
                    tag = true;
                    break;
                }
            }
            if(tag == true){
                return helper(s.substring(1,s.length()),t.substring(i+1,t.length()));
            }
            else
                return tag;
            
        }
    }
    //Solution 2:
    // public boolean helper(String s,String t){
    //     boolean [] dp = new boolean [s.length()];
    //     dp[0] = false;
    //     String res = "";
    //     int count = 0;
    //     for(int i = 0;i<t.length();i++){
    //         if(t.charAt(i) == s.charAt(count)){
    //             count ++;
    //         }
    //         if(count == s.length())
    //             break;
    //     }
    //     if(count == s.length())
    //         return true;
    //     else
    //         return false;
    // }
    //Solution 3: DP
}
