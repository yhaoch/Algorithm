public class Solution {
    public boolean checkRecord(String s) {
        if(s.length() <=1)
            return true;
        int count_a = 0;
        boolean count_l = false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'A')
                count_a ++;
            if(count_a >= 2 || count_l == true)
                return false;
            if(i>=1 && i<s.length()-1)
                if(s.charAt(i) == 'L' && s.charAt(i+1) == 'L' && s.charAt(i-1) == 'L'){
                    count_l = true;
                }
        }
        return true;
    }
}
