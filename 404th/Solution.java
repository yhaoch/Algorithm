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
    public int sumOfLeftLeaves(TreeNode root) {
         Queue<TreeNode> st = new LinkedList<TreeNode>();
         HashMap<TreeNode,Integer> st1 = new HashMap<TreeNode,Integer>();
         if(root == null)
            return 0;
         st.add(root);
         while(!st.isEmpty()){
             TreeNode tmp = st.remove();
             //System.out.println(tmp.val);
             if(tmp.left==null && tmp.right == null){
             }
             else if(tmp.left!=null && tmp.right == null){
                if(tmp.left.left == null && tmp.left.right == null)
                    st1.put(tmp.left,tmp.left.val);
                st.add(tmp.left);
             }
             else if(tmp.left==null && tmp.right != null){
                st.add(tmp.right);
             }
             else if(tmp.left!=null && tmp.right != null){
                if(tmp.left.left == null && tmp.left.right == null)
                    st1.put(tmp.left,tmp.left.val);
                st.add(tmp.left);
                st.add(tmp.right);
             }
         }
         int sum = 0;
         for(Map.Entry<TreeNode,Integer> entry:st1.entrySet()){
             sum += entry.getValue();
         }
         return sum;
    }
}
