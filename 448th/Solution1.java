public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashMap<Integer,Boolean> store = new HashMap<Integer,Boolean>();
        List<Integer> res = new ArrayList<Integer>();
        for(int i = 1;i<=nums.length;i++){
            store.put(i,false);
        }
        for(int i = 0;i<nums.length;i++){
            store.put(nums[i],true);
        }
        for(Map.Entry<Integer,Boolean> entry:store.entrySet()){
            if(entry.getValue() == false){
                res.add(entry.getKey());
            }
        }
        return res;
    }
}
