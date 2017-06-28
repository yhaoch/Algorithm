public class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        if(nums.length == 0)
            return 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] != val){
                //make all different val in the first count slots.
                nums[count] = nums[i];
                count ++;
            }
        }
        //only iterate from 0 to count.
        return count;
    }
}
