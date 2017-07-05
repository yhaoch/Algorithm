public class Solution {
    public String longestCommonPrefix(String[] strs) {
        int len = strs.length;
        String res = "";
        String temp = "";
        if(len == 0)
            return new String();
        if(len == 1)
            return strs[0];
        for(int i = 0; i < len ;i++){
            if(i==0)
                temp = strs[i];
            else{
                res = "";
                int len1 = temp.length();
                int len2 = strs[i].length();
                int minlen = Math.min(len1,len2);
                for(int j = 0;j<minlen;j++){
                    if(temp.charAt(j) == strs[i].charAt(j))
                        res += temp.charAt(j);
                    else
                        break;
                }
                temp = res;
            }
        }
        return res;
    }
}
