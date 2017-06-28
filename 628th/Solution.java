public class Solution {
    public int maximumProduct(int[] nums) {
        if(nums.length == 3){
            return nums[0] * nums[1] * nums[2];
        }
        else{
            int temp = 0;
            int len = nums.length;
            // for(int i=len-1;i>=0;i--){
            //     for(int j=0;j<i;j++){
            //         if(nums[j+1] < nums[j]){
            //             temp = nums[j];
            //             nums[j] = nums[j+1];
            //             nums[j+1] = temp;
            //         }
            //     }
            // }
            recsiveSort(nums,0,len-1);
            int product = nums[len-1] * nums[len-2] * nums[len-3];
            //System.out.println(product);
            if(product < 0){
                if(nums[len-1] < 0){
                    return nums[0] * nums[1] * nums[2];
                }
                return product;
            }
            else if(product > 0){
                if(nums[len-3] < 0){
                    return nums[0] * nums[1] * nums[len-1];
                }
                else{
                    if(nums[len-2]*nums[len-3] < nums[0]*nums[1])
                        return nums[0]*nums[1]*nums[len-1];
                }
                return product;
            }
            return nums[len-1] * nums[len-2] * nums[len-3];
        }
    }

    public int RTI(int[] list, int low, int high){
    int tmp = list[low];
    while(low < high){
      while(low < high && list[high] >= tmp){
        high --;
      }
      list[low] = list[high];
      while(low < high && list[low]<= tmp){
        low ++;
      }
      list[high] = list[low];
    }
    list[low] = tmp;
    return low;
  }

  public void recsiveSort(int [] list, int low, int high){
    if(low < high){
      int mid = RTI(list, low, high);
      recsiveSort(list,low, mid-1);
      recsiveSort(list,mid+1,high);
    }
  }
}
