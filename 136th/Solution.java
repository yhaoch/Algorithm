import java.util.HashMap;

/**
 * Created by yanghaochuan on 20/06/2017.
 */
public class Solution {
    public static int singleNumber(int[] nums) {
        HashMap<Integer,Boolean> store = new HashMap<Integer, Boolean>();
        int len = nums.length;
        int res = 0;
        for (int i=0;i<len;i++){
            if(store.keySet().contains(nums[i]))
                store.put(nums[i],false);
            else{
                store.put(nums[i],true);
            }
        }
        for(Integer key:store.keySet()){
            if(store.get(key) == true)
                res =  key;
            else
                res = 0;
        }
        return res;
    }
    //XOR 超赞
    public static int singleNumber_update(int[] nums) {
        //HashMap<Integer,Boolean> store = new HashMap<Integer, Boolean>();
        int len = nums.length;
        int res = 0;
        if(len == 0)
            return 0;
        for (int i=0;i<len;i++){
            res ^= nums[i];
        }
        return res;
    }

    public static void main(String args[]){
        int[] test = new int[7];
        test[0] = 1;
        test[1] = 5;
        test[2] = 2;
        test[3] = 1;
        test[4] = 3;
        test[5] = 5;
        test[6] = 2;
        System.out.println(singleNumber(test));
    }
}
