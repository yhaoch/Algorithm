public class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        for(int i = 0;i<nums.length-1;i++){
            for(int j = i+1;j<nums.length;j++){
                int temp = nums[i] + nums[j];
                if (nums[i] + nums[j] == target){
                    answer[0] = i;
                    answer[1] = j;
                }
            }
        }
        return answer;
    }
    public static void main(String args[]){
        int[] answer = {3,2,4};
        int[] ans = twoSum(answer,6);
        for (int i = 0;i<ans.length;i++){
            System.out.print(ans[i]);
        }
    }
}