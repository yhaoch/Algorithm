public class Solution {
    public boolean wordPattern(String pattern, String str) {
        if(pattern.length() == 0)
            return false;
        if(str.length() == 0)
            return false;
        char [] pat = pattern.toCharArray();
        String [] s = str.split(" ");
        if(pat.length != s.length)
            return false;
        else{
            //System.out.println(1);
            for(int i=0;i<s.length-1;i++){
                for(int j=i+1;j<s.length;j++){
                    if(s[i].equals(s[j]) == true && pat[i] == pat[j])
                        continue;
                    if(s[i].equals(s[j]) == false && pat[i] != pat[j])
                        continue;
                    else{
                        //System.out.println("aaa");
                        return false;
                    }
                }
            }
            return true;
        }
    }
}
