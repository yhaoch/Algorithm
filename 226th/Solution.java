/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
/**
 * in recursive function, it must have a return statement; 
 * However, this will not forbid us to set a recursive function "void"
 * if "void" function, the return statement's function is liking a break.
 * as long as the function did not return anything, the function could be
 * set as "void"!!!!
 */
public class Solution {
    public TreeNode invertTree(TreeNode root) {
        invert(root);
        return root;
    }
    public void invert(TreeNode root){
        if(root == null)
            return;
            
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        
        invert(root.left);
        invert(root.right);
    }
}
