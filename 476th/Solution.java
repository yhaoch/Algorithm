/**
 * Created by u6001301 on 18/06/17.
 */
public class Solution {
    public static int findComplement(int num) {
        String str_1 = Integer.toBinaryString(num);
        String result = "";
        for(int i = 0;i< str_1.length();i++){
            if(str_1.charAt(i) == '1')
                result += "0";
            else if(str_1.charAt(i) == '0'){
                result += "1";
            }
        }
        System.out.println(result);
        int ans=0;
        for(int j = 0;j<str_1.length();j++){
            if(result.charAt(j) == '1') {
                ans += (int) Math.pow(2, str_1.length() - j -1);
            }
        }
        return ans;
    }
    public static void main(String args[]) {
        System.out.println(findComplement(4));
    }
}
