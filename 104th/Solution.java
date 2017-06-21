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
    public int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
        else{
            int lt = maxDepth(root.left);
            int rt = maxDepth(root.right);
            return Math.max(lt,rt)+1;
        }
    }
}
