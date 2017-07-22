public class Solution {
    public boolean isMatch(String s, String p) {
        if(p.isEmpty()){
            if(s.isEmpty() == true)
                return true;
            else
                return false;
        }
        else if(p.length() == 1){
            if(p.charAt(0) == '.'){
                if(s.length() == 1)
                    return true;
                else
                    return false;
            }
            else if(p.equals(s) == true)
                return true;
            else 
                return false;
        }
        else if(p.charAt(1) == '*'){
            return (isMatch(s,p.substring(2,p.length())) || !s.isEmpty() && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.') && isMatch(s.substring(1,s.length()),p));
        }
        else{
            return !s.isEmpty() && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.') && isMatch(s.substring(1,s.length()),p.substring(1,p.length()));
        }
    }
}