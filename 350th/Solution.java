public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length == 0 || nums2.length ==0 )
            return new int[0];
        HashMap<Integer,Integer> st = new LinkedHashMap<>();
        HashMap<Integer,Integer> st1 = new LinkedHashMap<>();
        List<Integer> res = new ArrayList<>();
        int [] ans;
        for(int i = 0;i<nums1.length;i++){
            int temp = nums1[i];
            if(st.keySet().contains(temp) == true){
                st.put(temp,st.get(temp) + 1);
            }
            else
                st.put(temp,1);
        }
        for(int i = 0;i<nums2.length;i++){
            int temp = nums2[i];
            if(st1.keySet().contains(temp) == true){
                st1.put(temp,st1.get(temp) + 1);
            }
            else
                st1.put(temp,1);
        }
        
        int len1 = nums1.length,len2 = nums2.length;
        int minv = Math.min(len1,len2);
        if( minv == len1){
            for(Integer key:st.keySet()){
                if(st1.keySet().contains(key) == true){
                    int small = Math.min(st1.get(key),st.get(key));
                    for(int k = 0;k<small;k++){
                        res.add(key);
                    }
                }
            }
            ans = new int [res.size()];
            for(int j=0;j<res.size();j++){
                ans[j] = res.get(j);
            }
            return ans;
        }
        for(Integer key:st1.keySet()){
            if(st.keySet().contains(key) == true){
                int small = Math.min(st1.get(key),st.get(key));
                for(int k = 0;k<small;k++){
                    res.add(key);
                }
            }
        }
        ans = new int [res.size()];
        for(int j=0;j<res.size();j++){
            ans[j] = res.get(j);
        }
        return ans;
    }
}
