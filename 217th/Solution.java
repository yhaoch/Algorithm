public class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length <= 1)
            return false;
        Map<Integer,Integer> st = new LinkedHashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(st.keySet().contains(nums[i]) == true){
                //System.out.println(st.get(nums[i]) + 1);
                st.put(nums[i],st.get(nums[i]) + 1);
            }
            else
                st.put(nums[i],1);
        }
        // for(Map.Entry<Integer,Integer> entry:st.entrySet()){
        //     System.out.println(entry.getKey()+ " " + entry.getValue());
        // }
        for(Map.Entry<Integer,Integer> entry:st.entrySet()){
            //System.out.println(entry.getValue());
            if(entry.getValue() > 1 )
                return true;
        }
        return false;
    }
}