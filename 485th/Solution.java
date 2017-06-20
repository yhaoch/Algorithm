import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by u6001301 on 20/06/17.
 */

public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;
        if(nums.length == 0)
            return 0;
        for(int i = 0;i< nums.length;i++){
            if(nums[i] == 0){
                if(count > max){
                    max = count;
                    count = 0;
                }
                else
                    count =0;
            }
            else{
                count++;
            }
        }
        if(count > max)
            return count;
        else
            return max;
    }
}
