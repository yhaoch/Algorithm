//what if the input is [4,5,7]????
public class Solution {
    public int missingNumber(int[] nums) {
        int tmp = 0;
        int va = 0;
        if(nums.length == 1){
            if(nums[0] == 1)
                return 0;
            return nums[0] + 1;
        }
        
        // for(int i =0;i<nums.length;i++){
        //     if(nums[i] > nums.length){
        //         tmp = nums[i];
        //         va ^= nums[i];
        //     }
        //     else
        //         va ^= nums[i];
        // }
        // if(tmp == 0){
        //     return Math.max(nums[1],nums[0]) + 1;
        // }
        // va ^= tmp;
        // System.out.println(va);
        // for(int i =0;i<nums.length;i++){
        //     va ^= i;
        //     System.out.println(va);
        // }
        // return va;
        va = (int)(nums.length + 1) * nums.length / 2;
        for(int i=0;i<nums.length;i++){
            va -= nums[i];
        }
        return va;
    }
}
