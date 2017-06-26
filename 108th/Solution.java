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
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root = convert(nums,0,nums.length-1);
        return root;
    }
    public TreeNode convert(int [] nums, int low,int high){
        if(low <= high){
            int mid = low + (high-low)/2;
            TreeNode root = new TreeNode(nums[mid]);
            root.left = convert(nums,low,mid-1);
            root.right = convert(nums,mid+1,high);
            return root;
        }
        return null;
    }
}
