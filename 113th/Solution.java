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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> st = new ArrayList<>();
        List<Integer> st1 =  new ArrayList<>();
        compute(root,st1,st,sum);
        return st;
    }
    
    public void compute(TreeNode root, List<Integer> st1, List<List<Integer>> st2, int sum){
        if(root == null)
            return;
        else{
            sum -= root.val;
            st1.add(root.val);
            if(root.left == null && root.right == null)
                if(sum == 0)
                //这个用法需要记住，doc里确实也有。
                    st2.add(new ArrayList<>(st1));
                    //st2.add(st1);
            if(root.left != null) 
                compute(root.left,st1,st2,sum);
            if(root.right != null)
                compute(root.right,st1,st2,sum);
            //st1.remove(st1.size()-1);
            //System.out.println(st1.get(st1.size()-1));
            st1.remove(st1.size()-1);
        }
    }
}