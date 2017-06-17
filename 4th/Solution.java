/**
 * Created by u6001301 on 17/06/17.
 * Leetcode 617 Merge Two Binary Trees
 */

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
//    Queue<Integer> q = new LinkedList<Integer>();
    public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1 == null && t2 != null)
            return t2;
        else if(t2 == null && t1 != null)
            return t1;
        else if(t1 == null && t2 == null)
            return null;
        else{
            TreeNode resultTree = new TreeNode(t1.val + t2.val);
//            if(resultTree != null)
//                resultTree.val = t1.val + t2.val;
//            else
//                resultTree = new TreeNode(t1.val + t2.val);
//            System.out.print(resultTree.val + " ");
//            if(t1 == null && t2 != null)
//                merge(resultTree.left,null,t2.left);
//            else if(t1 != null && t2 == null)
//                merge(resultTree.left, t1.left, null);
//            else if(t1 ==null && t2 == null)
//                merge()
            resultTree.left = mergeTrees(t1.left,t2.left);
            resultTree.right = mergeTrees(t1.right,t2.right);
            return resultTree;
        }
    }
    //recursive must have return value. should not be void function!!!!
//    public static TreeNode merge(TreeNode t1, TreeNode t2){
//        if(t1 == null && t2 != null) {
//            return t2;
//        }
//        else if(t2 == null && t1 != null) {
//            return t1;
//        }
//        else if(t1 == null && t2 == null) {
//             return null;
//        }
//        else{
//            TreeNode resultTree = new TreeNode(t1.val + t2.val);
////            if(resultTree != null)
////                resultTree.val = t1.val + t2.val;
////            else
////                resultTree = new TreeNode(t1.val + t2.val);
////            System.out.print(resultTree.val + " ");
////            if(t1 == null && t2 != null)
////                merge(resultTree.left,null,t2.left);
////            else if(t1 != null && t2 == null)
////                merge(resultTree.left, t1.left, null);
////            else if(t1 ==null && t2 == null)
////                merge()
//            resultTree.left = merge(t1.left,t2.left);
//            resultTree.right = merge(t1.right,t2.right);
//            return resultTree;
//        }
//    }

    //bfs https: https://stackoverflow.com/questions/5262308/how-do-implement-a-breadth-first-traversal
    public static void breadth(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>() ;
        if (root == null)
            return;
        queue.clear();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode node = queue.remove();
            System.out.print(node.val + " ");
            if(node.left != null) queue.add(node.left);
            if(node.right != null) queue.add(node.right);
        }
    }
    public static void main(String args[]){
        TreeNode t1 = new TreeNode(1);
        t1.left = new TreeNode(3);
        t1.right = new TreeNode(2);
        t1.left.left = new TreeNode(5);

        TreeNode t2 = new TreeNode(2);
        t2.left = new TreeNode(1);
        t2.right = new TreeNode(3);
        t2.left.right = new TreeNode(6);

        TreeNode ans = mergeTrees(t1,t2);
        breadth(ans);
    }
}
