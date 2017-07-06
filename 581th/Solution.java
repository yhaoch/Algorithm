public class Solution {
    public int findUnsortedSubarray(int[] nums) {
        if(nums.length == 0)
            return 0;
        //
        int [] copy_nums = nums.clone();
        Arrays.sort(copy_nums);
        int len = nums.length;
        int i =0,j=len-1;
        int first = 0,stop = 0;
        boolean findstart = false,findstop = false;
        while(i <= j){
            if(nums[i] != copy_nums[i] && findstart == false){
                first = i;
                findstart = true;
                //System.out.println(i);
            }
            if((nums[j] != copy_nums[j]) && findstop == false){
                stop = j;
                findstop = true;
                //System.out.println(2+ " sdfadfadf" + stop);
            }
            if(findstart == true && findstop == true){
                break;
            }
            if(findstart != true && findstop == true){
                i++;
            }
            if(findstart == true && findstop != true){
                j--;
            }
            if(findstart != true && findstop != true){
                i++;
                j--;
            }
        }
        if(findstart == false && findstop == false)
            return 0;
        System.out.println(stop + " " + first);
        return stop - first + 1;
    }
}
