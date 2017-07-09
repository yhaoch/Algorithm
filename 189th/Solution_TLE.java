public class Solution {
    public void rotate(int[] nums, int k) {
        if(k <= nums.length){
            helper(nums,k);
        }
        else{
            k = k % nums.length;
            helper(nums,k);
        }
    }
    public void helper(int [] nums, int k){
        List<Integer> st = new ArrayList<>();
        for(int i = nums.length - k;i < nums.length;i++){
            st.add(nums[i]);
        }
        for(int i = 0;i<nums.length - k;i++){
            st.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            nums[i] = st.get(i);
        }
    }
}
