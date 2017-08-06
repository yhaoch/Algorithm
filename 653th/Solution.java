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
    public boolean findTarget(TreeNode root, int k) {
        if(root == null)
            return false;
        else{
            ArrayList<Integer> st = new ArrayList<>();
            travel(root,st);
            if(st.size() == 1){
                return false;
            }
            // for(int i = 0;i<st.size();i++)
            //     System.out.println(st.get(i));
            for(int i=0;i<st.size()-1;i++){
                for(int j=i+1;j<st.size();j++){
                    if(st.get(i) + st.get(j) == k)
                        return true;
                }
            }
            return false;
            //return isTrue(st,0,st.size()-1,k);
            //return true;
        }
    }
    
    public void travel(TreeNode root, ArrayList<Integer> st){
        if(root!=null)
		{
			st.add(root.val);
			travel(root.left, st);
			travel(root.right, st);
		}
    }
    
    public boolean isTrue(ArrayList<Integer> st,int start,int end,int k){
        if(st.get(start) == k)
            return true;
        else if(st.get(start) < k && start < end){
            boolean temp = isTrue(st,start+1,end,k-st.get(start));
            boolean temp_1 = isTrue(st,start+1,end,k);
            if(temp == true || temp_1 == true)
                return true;
            else
                return false;
        }
        else if(st.get(start) > k && start < end){
            return isTrue(st,start+1,end,k);
        }
        else
            return false;
    }
}