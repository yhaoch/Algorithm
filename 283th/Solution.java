public class Solution {
    public void moveZeroes(int[] nums) {
        int current = 0,next = 0;
        for(int i = 0;i<nums.length-1;i++){
            if(nums[i] == 0){
                current = i;
                for(int j = current+1;j<nums.length;j++){
                    if(nums[j] != 0){
                        nums[current] = nums[j];
                        nums[j] = 0;
                        current = j;
                    }
                }
            }
        }
    }
}