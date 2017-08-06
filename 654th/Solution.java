/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if(nums.length == 1)
            return new TreeNode(nums[0]);
        else{
            int len = nums.length;
            //int max = getMax(nums,0,len-1);
            //System.out.println(max);
            //System.out.println(nums[max]);
            TreeNode root = new TreeNode(0);
            build(root,0,len-1,nums);
//             root.left = build(0,max-1,nums)
//             root.right = build(max+1,len-1,nums);
            return root; 
        }
    }
    public int getMax(int [] nums, int start, int end){
        int max = -1;
        int index = -1;
        for(int i = start;i<=end;i++){
            if(nums[i] > max){
                max = nums[i];
                index = i;
            }
        }
        return index;
    }
    
    public void build(TreeNode root,int start, int end,int [] nums){
        if(start <= end){
            int max = getMax(nums,start,end);
            root = new TreeNode(max);
            //System.out.println(max);
            build(root.left,0,max-1,nums);
            build(root.right, max+1,end,nums);
        }
    }
}