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
    public int pathSum(TreeNode root, int sum) {
        if(root == null)
            return 0;
        return compute(root,sum) + pathSum(root.left,sum) + pathSum(root.right,sum);
    }
    
    public int compute(TreeNode root,int sum){
        int res = 0;
        if(root == null)
            return res;
        if(sum == root.val)
            res++;
        res += compute(root.left,sum - root.val);
        res += compute(root.right,sum - root.val);
        return res;
    }
}