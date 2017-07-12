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
    public int rob(TreeNode root) {
        if(root == null)
            return 0;
        int [] res = compute(root);
        return Math.max(res[0],res[1]);
    }
    
    
    public int [] compute(TreeNode root){
        if(root == null){
            int [] temp = {0,0};
            return temp;
        }
        
        int [] st = new int[2];
        int [] left = compute(root.left);
        int [] right = compute(root.right);
        
        st[0] = root.val + left[1] + right[1];
        st[1] = Math.max(left[0],left[1]) + Math.max(right[1],right[0]);
        return st;
    }
}
