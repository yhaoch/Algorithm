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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> st = new ArrayList<>();
        //List<Integer> save =  new ArrayList<>();
        if(root == null)
            return st;
        LinkedList<TreeNode> st1 = new LinkedList<TreeNode>();
        st1.add(root);
        while(!st1.isEmpty()){
            List<Integer> save =  new ArrayList<>();
            int len = st1.size();
            for(int i=0;i<len;i++){
                TreeNode node = st1.poll();
                if(node.left != null) st1.add(node.left);
                if(node.right != null) st1.add(node.right);
                save.add(node.val);
                //System.out.println(node.val);
            }
            st.add(0,save);
            //save.clear();
        }
        return st;
    }
}
