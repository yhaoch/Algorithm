public class NumArray {
    int [] arr;
    public NumArray(int[] nums) {
        arr = new int [nums.length+1];
        for(int i=1;i<nums.length +1;i++){
            arr[i] = arr[i-1] + nums[i-1];
        }
    }
    
    public int sumRange(int i, int j) {
        int sum = 0;
        sum = arr[j+1] - arr[i];
        return sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */
