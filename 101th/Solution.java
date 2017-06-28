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
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> st = new LinkedList<TreeNode>();
        //List<List<Integer>> res = new ArrayList<>();
        boolean res = true;
        //here
        st.add(root);
        st.add(root);
        while(!st.isEmpty()){
            TreeNode node1 = st.poll();
            TreeNode node2 = st.poll();
            if(node1 == null && node2 == null)
                continue;
            if(node1 == null || node2 == null)
                return false;
            else{
                if(node1.val != node2.val)
                    return false;
                //here
                st.add(node1.left);
                st.add(node2.right);
                st.add(node2.left);
                st.add(node1.right);
            }
        }
        return res;
    }
}
