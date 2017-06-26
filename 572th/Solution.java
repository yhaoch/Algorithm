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
    public boolean isSubtree(TreeNode s, TreeNode t) {
        Queue<TreeNode> st = new LinkedList<TreeNode>();
        st.add(s);
        while(!st.isEmpty()){
            isSame = true;
            TreeNode root = st.poll();
            System.out.println(root.val);
            if(root.left!=null)
                st.add(root.left);
            if(root.right!=null)
                st.add(root.right);
            preorder(root,t);
            //System.out.println(isSame);
            if(isSame == true)
                return isSame;
        }
        return false;
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
