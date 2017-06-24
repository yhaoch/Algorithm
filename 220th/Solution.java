public class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if(k == 0)
            return false;
        if(nums.length <= 1)
            return false;
        if(t<0)
            return false;
        // Map<Integer,Integer> st = new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //     int key = nums[i]/Math.max(t,1);
        //     if(st.keySet().contains(key-1) == true && Math.abs(nums[i] - st.get(key-1)) <=t)
        //         return true;
        //     else if(st.keySet().contains(key) == true && Math.abs(nums[i] - st.get(key)) <=t)
        //         return true;
        //     else if(st.keySet().contains(key+1) == true && Math.abs(nums[i] - st.get(key+1)) <=t)
        //         return true;
        //     st.put(key,nums[i]);
        //     if(i>=k){
        //         st.remove();
        //     }
        // }
        TreeSet<Integer> set = new TreeSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            int n = nums[i];
            if(set.floor(n) != null && n <= t + set.floor(n) || set.ceiling(n) != null && set.ceiling(n) <= t + n)
                return true;
            set.add(n);
            if (i >= k)
                set.remove(nums[i - k]);
        }
        return false;
    }
}