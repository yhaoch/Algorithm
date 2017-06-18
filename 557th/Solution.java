/**
 * Created by u6001301 on 18/06/17.
 */
public class Solution {
    public String reverseWords(String s) {
        String[] sa = s.split(" ");
        String ans= "";
        for(int j = 0;j<sa.length;j++){
            char temp;
            char[] charArray = sa[j].toCharArray();
            if(charArray.length > 1) {
                for (int k = 0; k < (charArray.length / 2); k++) {
                    temp = charArray[k];
                    charArray[k] = charArray[charArray.length - k - 1];
                    charArray[charArray.length - k - 1] = temp;
                }
            }
            ans += new String(charArray) + " ";

//            else if(charArray.length % 2 !=0){
//                for(int k = 0;k<(charArray.length/2 -1);k++) {
//                    temp = charArray[k];
//                    charArray[k] = charArray[charArray.length-k-1];
//                    charArray[charArray.length-k-1] = temp;
//                }
//            }
        }
        ans = ans.substring(0,ans.length()-1);
        return ans;
    }
    public static void main(String args[]){
        String s = "String Yang Hao chuan";
        String[] sa = s.split(" ");
        String ans= "";
        for(int j = 0;j<sa.length;j++){
            char temp;
            char[] charArray = sa[j].toCharArray();
            if(charArray.length > 1) {
                for (int k = 0; k < (charArray.length / 2); k++) {
                    temp = charArray[k];
                    charArray[k] = charArray[charArray.length - k - 1];
                    charArray[charArray.length - k - 1] = temp;
                }
            }
            ans += new String(charArray) + " ";

//            else if(charArray.length % 2 !=0){
//                for(int k = 0;k<(charArray.length/2 -1);k++) {
//                    temp = charArray[k];
//                    charArray[k] = charArray[charArray.length-k-1];
//                    charArray[charArray.length-k-1] = temp;
//                }
//            }
        }
        ans = ans.substring(0,ans.length()-1);
        System.out.println(ans);
    }
}