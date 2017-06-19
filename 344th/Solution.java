import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by u6001301 on 19/06/17.
 */
public class Solution {
    public static String reverseString(String s) {
        if(s == null)
            return null;
        else if(s.length() == 1)
            return s;
        else{
            char [] arr = s.toCharArray();
            int len = arr.length;
            for(int i = 0; i< (len/2);i++) {
                char temp = arr[i];
                arr[i] = arr[len - i - 1];
                arr[len - i - 1] = temp;
            }
            return new String(arr);
        }
    }
    public static void main(String args[]){
        String s = "hello";
        System.out.println(reverseString(s));
    }
}