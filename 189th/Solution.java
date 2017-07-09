//time o(n) space o(n)!
public class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
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

