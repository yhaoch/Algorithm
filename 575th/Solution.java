import java.util.HashMap;

/**
 * Created by u6001301 on 19/06/17.
 */
public class Solution {
    public int distributeCandies(int[] candies) {
        HashMap<Integer,Integer> store = new HashMap<Integer,Integer>();
        int len = candies.length;
        for(int i = 0;i< len;i++){
            store.put(candies[i],0);
        }
        int len_diff = store.keySet().size();
        if((len/2) >=  len_diff){
            return len_diff;
        }
        else{
            return (len/2);
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