import java.util.HashMap;

/**
 * Created by u6001301 on 18/06/17.
 */
public class Solution {
    public static String[] findWords(String[] words) {
        String row0 = "qwertyuiop";
        String row1 = "asdfghjkl";
        String row2 = "zxcvbnm";
        String ans = "";
        //String[] ans = new String[words.length];
        int count = 0;
        if(words.length == 0)
            return words;
        for(int i = 0;i< words.length;i++){
            HashMap<Character,Integer> NoRepeat = new HashMap<Character,Integer>();

            char[] arr = words[i].toLowerCase().toCharArray();
            for(int j =0; j< arr.length;j++){
                NoRepeat.put(arr[j],1);
            }
            boolean tag = true;
            for(Character key:NoRepeat.keySet()){
                if(row0.indexOf(key) < 0){
                    tag = false;
                }
            }
            if(tag == true){
                ans += words[i] + " ";
                //ans[count] = words[i];
                count ++;
            }else
                tag = true;
            for(Character key:NoRepeat.keySet()){
                if(row1.indexOf(key) < 0){
                    tag = false;
                }
            }
            if(tag == true){
                ans += words[i] + " ";
                //ans[count] = words[i];
                count ++;
            }else
                tag = true;
            for(Character key:NoRepeat.keySet()){
                if(row2.indexOf(key) < 0){
                    tag = false;
                }
            }
            if(tag == true){
                ans += words[i] + " ";
                count ++;
            }
        }
        //System.out.println(ans.length());
        if(ans.length() == 0){
            return new String[0];
        }
        else {
            ans = ans.substring(0, ans.length() - 1);
            String[] res = ans.split(" ");
            return res;
        }
    }
    public static void main(String args[]){
        String a [] = new String[3];
        a[0] = "asdfghjklASDFGHJKLasdfghjklASDFGHJKLzxcvbnmZXCVBNMaew";
        a[1] = "asdfghjklASDFGHJKLqwertyuiopQWERTYUIOP";
        a[2] = "zxcvbnmZXCVBNMaewzxcvbnmZXCVBNMaewzxcvbnmZXCVBNMaewzxcvbnmZXCVBNMaew";
        //a[3] = "Peace";
        String[] result = findWords(a);
        for(int i =0;i<result.length;i++)
            System.out.println(result[i]);
    }
    /*
    *
["asdfghjklASDFGHJKLasdfghjklASDFGHJKLzxcvbnmZXCVBNMaew","asdfghjklASDFGHJKLqwertyuiopQWERTYUIOP","zxcvbnmZXCVBNMaewzxcvbnmZXCVBNMaewzxcvbnmZXCVBNMaewzxcvbnmZXCVBNMaew"]
    *
    * */
}