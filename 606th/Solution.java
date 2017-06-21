import java.util.*;

/**
 * Created by u6001301 on 21/06/17.
 */
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
    public String tree2str(TreeNode t) {
        if(t == null)
            return "";
        if(t.left == null && t.right == null)
            return String.valueOf(t.val);
        // if(t.left == null && t.right != null)
        //     return "()(" +tree2str(t.right)+ ")" ;
        if(t.left != null && t.right == null)
            return String.valueOf(t.val)  + "(" +tree2str(t.left)+")";
        return String.valueOf(t.val) +"(" + tree2str(t.left)+ ")" + "(" + tree2str(t.right) + ")";
    }
}
