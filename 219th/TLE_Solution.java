public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(k == 0)
            return false;
        if(nums.length <= 1)
            return false;
        for(int i = 0;i<nums.length-1;i++){
            for(int j = k;j>=1;j--){
                if(i+j<nums.length){
                    //System.out.println(i+j);
                    if(nums[i] == nums[i+j])
                        return true;
                    // else
                    //     break;
                }
            }
        }
        return false;
    }
}