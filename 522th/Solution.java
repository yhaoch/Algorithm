public class Solution {
    public int findLUSlength(String[] strs) {
        HashMap<String, Integer> store = new HashMap<String, Integer>();
        for(int i = 0;i< strs.length;i++)
            store.put(strs[i],strs[i].length());
        List<Map.Entry<String, Integer>> slist =
                new ArrayList<Map.Entry<String, Integer>>(store.entrySet());
        Collections.sort(slist, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return (o2.getValue() - o1.getValue());
            }
        });
        int max = 0;
        for (Map.Entry<String, Integer> entry : slist){
            String key = entry.getKey();
            for (Map.Entry<String, Integer> entry1 : slist){
                String key1 = entry1.getKey();
                //System.out.println(key1);
                if(key == key1)
                    continue;
                else{
                    if (LUS(key1,key) == false){
                        int temp = key1.length();
                        System.out.println(temp);
                        if(temp > max)
                            max = temp;
                    }
                    else if(LUS(key1,key) == true){
                        //System.out.println(key1);
                        max = -1;
                        break;
                    }
                }
            }
        }
        return max;
    }
    public boolean LUS(String s1, String s2){
        int count = 0;
        //System.out.println(s2.length());
        //System.out.println(s1.length());
        if(s2.length() == 0 || s1.length() == 0)
            return false;
        for(int i = 0;i<s2.length();i++){
            if(s2.charAt(i) == s1.charAt(count)){
                count++;
            }
            if(count == s1.length())
                break;
        }
        if(count == s2.length())
            return true;
        else
            return false;
    }
}