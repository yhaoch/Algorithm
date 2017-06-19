import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by u6001301 on 19/06/17.
 */
public class Solution {
    public static List<String> fizzBuzz(int n) {
        //list is just a interface, need to be implemented by LinkList or arraylist..
        List<String> store = new ArrayList<String>();
        if(n==0){
            return store;
        }
        else {
            for (int i = 1; i <= n; i++) {
                if (i % 3 == 0 && i % 5 != 0) {
                    store.add("Fizz");
                } else if (i % 3 != 0 && i % 5 == 0) {
                    store.add("Buzz");
                } else if (i % 3 == 0 && i % 5 == 0) {
                    store.add("FizzBuzz");
                } else {
                    store.add(String.valueOf(i));
                }
            }
            return store;
        }
    }
    public static void main(String args[]){
        int n = 0;
        List<String> ans = fizzBuzz(n);
        for(int i =0;i<15;i++){
            System.out.println(ans.get(i));
        }
    }
}