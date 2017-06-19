import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by u6001301 on 19/06/17.
 */
public class Solution {
    public String reverseStr(String s, int k) {
        if(s.length() <=1)
            return s;
        else{
            char[] arr = s.toCharArray();
            int len = s.length();
            int beginning = 0;
            while(len != 0){
                if( len >= 2*k){
//                    String temp = s.substring(0,2*k-1);
//                    String res = reverseString(temp);
                    len -= 2*k;
                    for(int i = 0; i<(k/2);i++) {
                        char temp = arr[i+beginning];
                        arr[i + beginning] = arr[beginning + k - i - 1];
                        arr[beginning + k - i - 1] = temp;
                    }
                    beginning += 2 * k;
                }
                else if(len < 2*k && len >=k){
                    len -= len;
                    for(int i = 0; i<(k/2);i++) {
                        char temp = arr[i+beginning];
                        arr[i + beginning] = arr[beginning + k - i - 1];
                        arr[beginning + k - i - 1] = temp;
                    }
                    beginning += len;
                }
                else{
                    for(int i = 0; i<(len/2);i++) {
                        char temp = arr[i+beginning];
                        arr[i + beginning] = arr[beginning + len - i - 1];
                        arr[beginning + len - i - 1] = temp;
                    }
                    len -= len;
                    beginning += len;
                }
            }
            return new String(arr);
        }
    }
}