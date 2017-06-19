import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by u6001301 on 19/06/17.
 */
public class Solution {
    public int[] nextGreaterElement(int[] findNums, int[] nums) {
        sortArr(nums);
        int len2 = nums.length;
        int len1 = findNums.length;
        int [] res = new int[len1];
        HashMap<Integer,Integer> store = new HashMap<Integer,Integer>();
        for(int i = 0;i<len2;i++){
                store.put(nums[i],i);
        }
        for(int i = 0;i<len1;i++){
            int idx = store.get(findNums[i]);
            res[i] = Search(nums,idx,len2-1,findNums[i]);
        }
        return res;
    }

    public int Search(int [] arr,int low,int high,int target){
        if(low < high){
            for(int i = low;i<=high;i++){
                if(arr[i] > target)
                    return arr[i];
            }
        }
        return -1;
    }


    public void sortArr(int [] nums) {
        int temp;
        for (int i = nums.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (nums[j + 1] < nums[j]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }
}