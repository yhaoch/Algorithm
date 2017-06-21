//better using less time.

public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int [] count = new int[nums.length + 1];
        List<Integer> res = new ArrayList<Integer>();
        for(int i = 0;i<nums.length;i++){
            count[nums[i]] ++;
        }
        for(int j =1; j<= nums.length;j++){
            if(count[j] == 0)
                res.add(j);
        }
        return res;
    }
}
