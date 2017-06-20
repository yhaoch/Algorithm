//haha interesting.......
public class Solution {
    public int findLUSlength(String a, String b) {
        int len1 = a.length();
        int len2 = b.length();
        if(a.equals(b))
            return -1 ;
        else{
            return Math.max(len1,len2);
        }
    }
}