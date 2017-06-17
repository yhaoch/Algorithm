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
	//bfs
	Queue<Integer> q = new LinkedList<Integer>();
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1 == null && t2 != null)
        	return t2;
        else if(t2 == null && t1 != null)
        	return t1;
        else if(t1 == null && t2 == null)
        	return null;
        else{
        	
        }
    }
}