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
    public int getMinimumDifference(TreeNode root) {
        //ArrayList<Integer> res = new ArrayList<Integer>();
        HashMap<Integer,Integer> res = new HashMap<Integer,Integer>();
        inOrder(res,root);
        int min_value = 99999999;
        for(Map.Entry<Integer,Integer> entry:res.entrySet()){
            for(Map.Entry<Integer,Integer> entry1:res.entrySet()){
                if(entry.getKey() == entry1.getKey()){
                    continue;
                }
                else{
                    if(Math.abs(entry.getKey() - entry1.getKey()) < min_value)
                        min_value = Math.abs(entry.getKey() - entry1.getKey());
                }
            }
        }
        return min_value;
    }
    public void inOrder(HashMap<Integer,Integer> res,TreeNode root){
        if(root!=null){
            inOrder(res,root.left);
            res.put(root.val,0);
            inOrder(res,root.right);
        }
    }
}
