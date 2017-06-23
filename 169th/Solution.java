public class Solution {
    public int majorityElement(int[] nums) {
        int len = nums.length;
        double maj = (double)len/2;
        Map<Integer,Integer> st = new LinkedHashMap<Integer,Integer>();
        if(len == 1)
            return nums[0];
        for(int i=0;i<len;i++){
            if(st.keySet().contains(nums[i]) == true){
                st.put(nums[i],st.get(nums[i]) + 1);
            }
            else
                st.put(nums[i],1);
        }
        for(Map.Entry<Integer,Integer> entry:st.entrySet()){
            if(entry.getValue() >= maj)
                return entry.getKey();
        }
        return -1;
    }
}