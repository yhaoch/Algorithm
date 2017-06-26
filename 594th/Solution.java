public class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer,Integer> st = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            if(st.keySet().contains(nums[i]) == true){
                st.put(nums[i],st.get(nums[i]) + 1);
            }
            else
                st.put(nums[i],1);
        }
        int max_len = 0;
        for(Map.Entry<Integer,Integer> entry:st.entrySet()){
            if(st.keySet().contains(entry.getKey()+1) == true)
                if(entry.getValue() + st.get(entry.getKey()+1) > max_len)
                    max_len = entry.getValue() + st.get(entry.getKey()+1);
            else if(st.keySet().contains(entry.getKey()-1) == true){
                if(entry.getValue() + st.get(entry.getKey()-1) > max_len)
                    max_len = entry.getValue() + st.get(entry.getKey()-1);
            }
        }
        return max_len;
    }
}