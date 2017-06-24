//Using HashMap. 暴力方法TLE

public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(k == 0)
            return false;
        if(nums.length <= 1)
            return false;
        Map<Integer,Integer> st = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(st.keySet().contains(nums[i]) == true){
                if(Math.abs(st.get(nums[i]) - i) <= k)
                    return true;
                else
                    st.put(nums[i],i);
            }
            else
                st.put(nums[i],i);
        }
        return false;
    }
}