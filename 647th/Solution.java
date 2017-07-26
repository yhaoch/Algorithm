public class Solution {
    public int countSubstrings(String s) {
        if(s.length() == 0)
            return 0;
        else if(s.length() == 1)
            return 1;
        else{
            int max_pa = s.length();
            int n = s.length();
            for(int len = 1;len<n;len++){
                for(int i = 0;i < n - len;i ++){
                    if(helper(s.substring(i,i+len+1)) == true)
                        max_pa ++;
                }
            }
            return max_pa;
        }
    }
    public boolean helper(String str){
        int len = str.length();
        int i = 0, j = len-1;
        boolean res = true;
        while(i<=j){
            if(str.charAt(i) != str.charAt(j)){
                res = false;
                break;
            }
            else{
                i++;
                j--;
            }
        }
        return res;
    }
}