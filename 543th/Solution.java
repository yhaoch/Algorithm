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
    int ans = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root != null){
            int left = depth(root.left);
            int right = depth(root.right);
            //System.out.println(left + " " + right);
            if((left+right) > ans)
                ans = left + right;
            return ans;
        }
        return 0;
    }

    public int depth(TreeNode root){
        if(root == null)
            return 0;
        int le = depth(root.left);
        int rt = depth(root.right);
        if((le+rt) > ans)
            ans = le + rt;
        return 1 + Math.max(le,rt);
    }
}
