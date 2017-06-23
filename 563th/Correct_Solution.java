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
    //recursive fucntion is very interesting! 
    int sum = 0;
    public int findTilt(TreeNode root) {
        compute(root);
        return sum;
    }
    public int compute(TreeNode root){
        if(root == null)
            return 0;
        int left = compute(root.left);
        int right = compute(root.right);
        sum += Math.abs(left - right);
        return root.val + left + right;
    }
    public void Tra(TreeNode root){
        if(root != null){
            System.out.println(root.val);
            Tra(root.left);
            Tra(root.right);
        }
    }
}
