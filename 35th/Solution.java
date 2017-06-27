public class Solution {
    int mid = 0;;
    public int searchInsert(int[] nums, int target) {
        if(nums.length == 0)
            return 1;
        else if(nums.length == 1){
            if(target > nums[0])
                return 1;
            return 0;
        }
        else{
            return binarySearch(nums,0,nums.length-1,target);
        }
    }
    public int binarySearch(int arr[],int low,int high,int target){
        if(low <= high){
            mid = low + (high - low) / 2;
            if(target > arr[mid])
                return binarySearch(arr, mid + 1, high, target);
            if(target < arr[mid])
                return binarySearch(arr, low, mid -1, target);
            return mid;
        }
        return high +1;
    }
}
