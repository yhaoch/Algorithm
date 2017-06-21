public class Solution {
    public int findLUSlength(String[] strs) {
        HashMap<String, Integer> store = new HashMap<String, Integer>();
        // for(int i = 0;i< strs.length;i++)
        //     store.put(strs[i],strs[i].length());
        // List<Map.Entry<String, Integer>> slist =
        //         new ArrayList<Map.Entry<String, Integer>>(store.entrySet());
        // Collections.sort(slist, new Comparator<Map.Entry<String, Integer>>() {
        //     public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
        //         return (o2.getValue() - o1.getValue());
        //     }
        // });
        int max =-1;
        int len = strs.length;
        HashMap<String, Boolean> store1 = new HashMap<String,Boolean>();
        for (int i=0;i<len;i++){
            // String key = entry.getKey();
            // System.out.println(key);
            for (int j=0;j<len;j++){
                // String key1 = entry1.getKey();
                //System.out.println(strs[j] + " " +strs[i] + " " + LUS(strs[j],strs[i]));
                //System.out.println(key + " " + key1);
                if(j == i)
                    continue;
                else if(strs[j] == strs[i]){
                    store1.put(strs[j],true);
                    continue;
                }
                else if(strs[j].length() > strs[i].length())
                    continue;
                else if (LUS(strs[j],strs[i]) == false){
                        //System.out.println(strs[j] + " " +strs[i] + " " + LUS(strs[j],strs[i]));
                        int temp = strs[j].length();
                        //System.out.println(strs[i] + " " + temp);
                        if(temp > max && !store1.keySet().contains(strs[j])){
                        //if(temp > max)
                            max = temp;
                            //System.out.println(max);
                        }
                    }
                else if(LUS(strs[j],strs[i]) == true){
                        max = -1;
                        break;
                    }
            }
        }
        return max;
    }
    public boolean LUS(String s1, String s2){
        int count = 0;
        //System.out.println(s2.length());
        //System.out.println(s1.length());
        //if(s1.length() > s2.length())
           // return true;
        if(s2.length() == 0 || s1.length() == 0)
            return false;
        for(int i = 0;i<s2.length();i++){
            if(s2.charAt(i) == s1.charAt(count)){
                count++;
            }
            if(count == s1.length())
                break;
        }
        //System.out.println(s2 + " " + count + "  " + s1.length());
        if(count == s1.length())
            return true;
        else
            return false;
    }
}