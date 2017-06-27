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
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null)
            return false;
        else{
            sum -= root.val;
            if(root.left == null && root.right == null){
                if(sum == 0)
                    return true;
                else
                    return false;
            }
            if(root.left != null && hasPathSum(root.left,sum) == true) 
                return true;
            if(root.right != null && hasPathSum(root.right,sum) == true) 
                return true;
            return false;
        }
    }
}