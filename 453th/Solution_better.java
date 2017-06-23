public class Solution {
    //cool 
    public int minMoves(int[] nums) {
        int count = 0;
        if(nums.length == 1)
            return 0;
        else{
            int res = 0;
            int minv = 0;
            minv = minimalv(nums);
            for(int i=0;i<nums.length;i++) {
                count += (nums[i] - minv);
            }
        }
        return count;
    }

    public int minimalv(int [] m){
        int len = m.length;
        int min_value = m[0];
        int idx = 0;
        for(int i =0;i<len;i++) {
            if (m[i] < min_value){
                min_value = m[i];
            }
        }
        return min_value;
    }
}
