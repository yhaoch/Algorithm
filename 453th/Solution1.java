public class Solution {
    public static int minMoves(int[] nums) {
        int count = 0;
        if(nums.length == 1)
            return 0;
        else if(nums.length == 2)
            return Math.abs(nums[0] - nums[1]);
        else{
            int res = 0;
            int maxidx = 0;
            while(true){
                if(isDone(nums) == true)
                    break;
                else{
                    maxidx = maxv(nums);
                    for(int i=0;i<nums.length;i++){
                        if(i == maxidx)
                            continue;
                        else{
                            nums[i]++;
                        }
                    }
                    count++;
                }
            }
        }
        return count;
    }
    public static boolean isDone(int [] n){
        int len = n.length;
        int count = 0;
        //int lc = 0;
        while(count < len-1){
            if(n[count] == n[count+ 1])
                count++;
            else{
                break;
            }
        }
        if(count == (len -1))
            return true;
        else
            return false;
    }

    public static int maxv(int [] m){
        int len = m.length;
        int max_value = 0;
        int idx = 0;
        for(int i =0;i<len;i++) {
            if (m[i] > max_value){
                max_value = m[i];
                idx = i;
            }
        }
        return idx;
    }
}
