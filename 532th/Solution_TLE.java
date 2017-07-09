public class Solution {
    public int findPairs(int[] nums, int k) {
	if(k<0 || nums.length == 0)
            return 0;
        HashMap<Integer,Integer> st = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(st.keySet().contains(nums[i]) == true)
                st.put(nums[i],st.get(nums[i]) + 1);
            else{
                st.put(nums[i],0);
            }
        }
        if(k== 0){
            int count1 = 0;
            for(Integer key:st.keySet()){
                //System.out.println(st.get(key));
                if(st.get(key) >= 1)
                    count1 ++;
            }
            return count1;
            //System.out.println(key);
        }
        List<Integer> st1 = new ArrayList<>();
        for(Integer key:st.keySet()){
            st1.add(key);
            //System.out.println(key);
        }
        int count = 0;
        for(int i=0;i<st1.size()-1;i++){
            for(int j=i+1;j<st1.size();j++){
                if(Math.abs(st1.get(i) - st1.get(j)) == k)
                    count ++;
            }
        }
        return count;
    }
}
