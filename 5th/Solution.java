/*
 * Haochuan Yang
 * LeetCode 461 Hamming Distance
 */
public class Solution {
    public static int hammingDistance(int x, int y) {
        int count = 0;
        String s1 = transform(x);
        String s2 = transform(y);
        //System.out.println(s1 + "    " + s2);
        String s = "";
        int len1 = s1.length();
        int len2 = s2.length();
        //System.out.println(len1 + " " + len2);
        int min = 0;
        int max = 0;
        if(len1 > len2) {
            min = len2;
            max = len1;
            s = s1;
            while(min!=0) {
                if (s1.charAt(len1-1) != s2.charAt(len2-1)) {
                    count++;
                    min--;
                    len1--;
                    len2--;
                } else {
                    min--;
                    len1--;
                    len2--;
                }
            }
            System.out.println(count);
            if((len1 - len2 -1)!=0){
                for (int i = 0; i < (len1 - len2); i++)
                    if (s.charAt(i) == '1')
                        count++;
            }
            else if((len1 - len2 -1)==0)
                count++;
            System.out.println(count);
        }
        else if(len1 < len2) {
            min = len1;
            max = len2;
            s = s2;
            while(min!=0) {
                if (s1.charAt(len1-1) != s2.charAt(len2-1)) {
                    count++;
                    min--;
                    len1--;
                    len2--;
                } else {
                    min--;
                    len1--;
                    len2--;
                }
            }
            //System.out.println(count);
            //System.out.println((max - min -1));
            if((len2 - len1 -1)!=0){
                for (int i = 0; i < (len2 - len1); i++)
                    if (s.charAt(i) == '1')
                        count++;
            }
            else if((len2 - len1 -1)==0)
                count++;
            //System.out.println(count);
        }
        else if(len1 == len2){
            min = len1;
            while(min!=0) {
                if (s1.charAt(len1 - 1) != s2.charAt(len2 - 1)) {
                    count++;
                    min--;
                    len1--;
                    len2--;
                } else {
                    min--;
                    len1--;
                    len2--;
                }
            }
        }

        return count;
    }
    public static String transform(int x){
        String ans = "";
        if(x == 0)
            return "0";
        else {
            while (x / 2 != 0) {
                ans = String.valueOf(x % 2) + ans;
                //System.out.println(ans);
                //System.out.println(x);
                x = x / 2;
            }
            ans = "1" + ans;
            return ans;
        }
    }  
    public static void main(String args[]){
        int x = 14,y=2  ;
        System.out.println(hammingDistance(x,y));
        //System.out.println("0" + "0");
    }
}