public class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer> st = new LinkedHashMap<Character,Integer>();
        for(int i = 0;i<s.length();i++){
            if(st.keySet().contains(s.charAt(i)) == true){
                st.put(s.charAt(i),st.get(s.charAt(i)) + 1);
            }
            else
                st.put(s.charAt(i),1);
        }
        for(Map.Entry<Character,Integer> entry:st.entrySet()){
            //System.out.println(entry.getValue());
            if(entry.getValue() == 1){
                for(int j = 0;j<s.length();j++){
                    if(s.charAt(j) == entry.getKey()){
                        return j;
                    }
                }
            }
        }
        return -1;
    }
}