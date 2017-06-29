public class Solution {
    public boolean repeatedSubstringPattern(String s) {
        if(s.length() <= 1)
            return false;
        for(int i = s.length()/2;i>=1;i--){
            if(s.length() % i == 0){
                int count = s.length() / i;
                String temp = "";
                for(int j = 0;j<count;j++){
                    temp += s.substring(0,i);
                }
                if(temp.equals(s) == true)
                    return true;
            }
        }
        return false;
    }
}
