public class Solution {
    public int titleToNumber(String s) {
        if(s.length() == 0)
            return 0;
        //char [] st = s.toCharArray();
        int len = s.length();
        int sum = 0;
        for(int i = 0;i<len;i++){
            int temp = (int)s.charAt(i) - 64;
            for(int j = len-i-1; j>0;j--){
                temp *= 26; 
            }
            sum += temp;
        }
        return sum;
    }
}
