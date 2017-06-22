public class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int count = 0;
        if(g.length == 0 || s.length == 0){
            return 0;
        }
        else{
            recSort(g,0,g.length-1);
            recSort(s,0,s.length-1);
            int idx = 0;
            for(int i=0;i<g.length;i++){
                for(int j = idx;j<s.length;j++){
                    if(s[j] >= g[i]){
                        idx = j+1;
                        count ++;
                        break;
                    }
                }
            }
        }
        return count;
    }
    public int Return_target_index(int [] nums, int low, int high){
        Integer tmp = nums[low];
        while(low < high){
            while(low < high && nums[high] >= tmp){
                high --;
            }
            nums[low] = nums[high];
            while(low < high && nums[low] <= tmp){
                low ++;
            }
            nums[high] = nums[low];
        }
        nums[low] = tmp;
        return low;
    }
    public void recSort(int [] nums, int low, int high){
        if(low < high){
            int mid = Return_target_index(nums, low, high);
            recSort(nums,low, mid-1);
            recSort(nums,mid+1,high);
        }
    }
}
