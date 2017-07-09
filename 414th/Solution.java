/**
这道题让我们求数组中第三大的数，如果不存在的话那么就返回最大的数，题目中说明了这里的第三大不能和第二大相同，必须是严格的小于，而并非小于等于。这道题并不是很难，如果知道怎么求第二大的数，那么求第三大的数的思路都是一样的。那么我们用三个变量first, second, third来分别保存第一大，第二大，和第三大的数，然后我们遍历数组，如果遍历到的数字大于当前第一大的数first，那么三个变量各自错位赋值，如果当前数字大于second，小于first，那么就更新second和third，如果当前数字大于third，小于second，那就只更新third，注意这里有个坑，就是初始化要用长整型long的最小值，否则当数组中有INT_MIN存在时，程序就不知道该返回INT_MIN还是最大值first了
**/

public class Solution {
    public int thirdMax(int[] nums) {
        long first = Long.MIN_VALUE,second = Long.MIN_VALUE,third = Long.MIN_VALUE;
        for(int i = 0;i < nums.length;i++){
            if(nums[i] > first){
                third = second;
                second = first;
                first = nums[i];
            }
            else if(nums[i] < first && nums[i] > second){
                third = second;
                second = nums[i];
            }
            else if(nums[i] > third && nums[i] < second){
                third = nums[i];
            }
        }
        if(third > Long.MIN_VALUE)
            return (int)third;
        else
            return (int)first;
    }
}
