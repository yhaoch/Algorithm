/**
 * Created by yanghaochuan on 17/06/2017.
 * LeetCode 561, quick sort.
 */
public class Solution {
    public int arrayPairSum(int[] nums) {
        recSort(nums,0,nums.length-1);
        int sum = 0;
        for(int i = 0;i<nums.length;i+=2){
            sum += nums[i];
        }
        return sum;
    }
// 冒泡 效率太低
//    public void sortArr(int [] nums) {
//        int temp;
//        for (int i = nums.length - 1; i >= 0; i--) {
//            for (int j = 0; j < i; j++) {
//                if (nums[j + 1] < nums[j]) {
//                    temp = nums[j];
//                    nums[j] = nums[j + 1];
//                    nums[j + 1] = temp;
//                }
//            }
//        }
//    }
    public int Return_target_index(int [] nums, int low, int high){
    //取数组的第一个数为标记， 下面要做的就是得到这个标记的index
        Integer tmp = nums[low];
    // 很精致的算法
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
    //终止
        nums[low] = tmp;
        return low;
    }
    //quick Sort 迭代过程
    public void recSort(int [] nums, int low, int high){
        if(low < high){
            int mid = Return_target_index(nums, low, high);
            recSort(nums,low, mid-1);
            recSort(nums,mid+1,high);
        }
    }
}
