public class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0)
            return 0;
        if(nums.length == 1)
            return 1;
        int idx1 = 0;
        for(int i = 0;i< nums.length-1;i++){
            if(nums[i] != nums[i+1]){
                idx1 ++;
                nums[idx1] = nums[i+1];
            }
        }
        return idx1 + 1;
    }
}
