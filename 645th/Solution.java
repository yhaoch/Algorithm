public class Solution {
    public int[] findErrorNums(int[] nums) {
        //int [] res = new int [2];
        // if(nums.length == 2){
        //     res[0] = nums[0];
        //     res[1] = nums[0] + 1;
        //     return res;
        // }
        int [] res = new int [2];
        //Arrays.sort(nums);
        // int idx = 0;
        // int or = 0, wr = 0;
        HashMap<Integer,Integer> st = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            if(st.keySet().contains(nums[i]) == false){
                st.put(nums[i],0);
                // if(i+1 < nums.length && nums[i] == nums[i+1]){
                //     res[1] = nums[i+1] - 1;
                //     res[0] = nums[i+1];
                //     return res;
                // }
                // if(i-1 >=0 && nums[i] == nums[i-1]){
                //     res[0] = nums[i-1];
                //     idx = i;
                //     if(idx == nums.length -1){
                //         res[1] = idx+1;
                //         return res;
                //     }
                //     break;
                // }
                // res[1] = i + 1;
                // res[0] = nums[i];
                // break;
                //int temp = nums[i];
                // for(int j = i+1)
                //     if(nums[j] == temp){
                //         res[0] == nums[j];
                //     }
            }
            else{
                res[0] = nums[i];
            }
        }
        for(int j = 1;j<=nums.length;j++){
            if(st.keySet().contains(j) == false){
                res[1] = j;
            }
        }
        return res;
    }
}