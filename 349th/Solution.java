public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        if(nums1.length == 0 || nums2.length ==0)
            return new int[0];
        HashMap<Integer,Integer> st = new HashMap<Integer,Integer>();
        HashMap<Integer,Integer> st1 = new HashMap<Integer,Integer>();
        for(int i=0;i<nums1.length;i++)
            st.put(nums1[i],0);
        for(int j=0;j<nums2.length;j++)
            st1.put(nums2[j],0);
        int count = 0;
        for(Map.Entry<Integer,Integer> entry:st1.entrySet()){
            if(st.keySet().contains(entry.getKey()) == true)
                count ++;
        }
        int [] res = new int[count];
        int idx = 0;
        for(Map.Entry<Integer,Integer> entry:st1.entrySet()){
            if(st.keySet().contains(entry.getKey()) == true){
                res[idx] = entry.getKey();
                idx++;
            }
        }
        return res;
    }
}
