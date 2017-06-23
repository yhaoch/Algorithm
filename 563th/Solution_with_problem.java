/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

//TEL.. The reason??
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
        sum += Math.abs(compute(root.left)- compute(root.right));
        return root.val + compute(root.left) + compute(root.right);
    }
    public void Tra(TreeNode root){
        if(root != null){
            System.out.println(root.val);
            Tra(root.left);
            Tra(root.right);
        }
    }
}
