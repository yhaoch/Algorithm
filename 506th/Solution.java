public class Solution {
    public String[] findRelativeRanks(int[] nums) {
        if(nums.length == 0)
            return new String [0];
        String [] res = new String[nums.length];
        HashMap<Integer,Integer> st = new HashMap<Integer,Integer>();
        //HashMap<Integer,Integer> st1 = new HashMap<Integer,Integer>();
        Map<Integer,Integer> st1 = new LinkedHashMap<>();
        for(int i = 0;i<nums.length;i++){
            st.put(i,nums[i]);
        }
        //******
        List<Map.Entry<Integer, Integer>> entries = new ArrayList<Map.Entry<Integer, Integer>>(st.entrySet());
        Collections.sort(entries, new Comparator<Map.Entry<Integer,Integer>>() {
        public int compare(Map.Entry<Integer, Integer> o1,Map.Entry<Integer, Integer> o2) {
            //return (o2.getValue()).compareTo(o1.getValue());
            return o2.getValue() - o1.getValue();
        }});
        for(Map.Entry<Integer,Integer> entry:entries){
            st1.put(entry.getKey(),entry.getValue());
            //System.out.println(entry.getKey() + " " + entry.getValue());
        }
        // for(Map.Entry<Integer,Integer> entry:st1.entrySet()){
        //     //st1.put(entry.getKey(),entry.getValue());
        //     System.out.println(entry.getKey() + " " + entry.getValue());
        // }
        //******
        int count = 1;
        for(Map.Entry<Integer,Integer> entry:st1.entrySet()){
            if(count > 3){
                res[entry.getKey()] = String.valueOf(count);
                count ++;
            }
            else if(count == 1){
                //System.out.println(entry.getKey());
                res[entry.getKey()] = "Gold Medal";
                count ++;
            }
            else if(count ==2){
                res[entry.getKey()] = "Silver Medal";
                count ++;
            }
            else if(count == 3){
                res[entry.getKey()] = "Bronze Medal";
                count ++;
            }
        }
        return res;
    }
}
