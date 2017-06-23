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
    boolean isSame = true;
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null)
            return true;
        else{
            preorder(p, q);
            return isSame;
        }
    }
    public void preorder(TreeNode p, TreeNode q){
        if(p != null && q != null){
            if(p.val != q.val)
                isSame = false;
            preorder(p.left,q.left);
            preorder(p.right,q.right);
        }
        else if(p == null && q != null)
            isSame = false;
        else if(p != null && q == null)
            isSame = false;
    }
}