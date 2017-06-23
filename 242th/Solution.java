public class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() == 0 && t.length() == 0)
            return true;
        if(s.length() != t.length())
            return false;
        Map<Character,Integer> st = new LinkedHashMap<Character,Integer>();
        Map<Character,Integer> st1 = new LinkedHashMap<Character,Integer>();
        boolean res = true;
        for(int i=0;i<s.length();i++){
            if(st.keySet().contains(s.charAt(i)) == true)
                st.put(s.charAt(i),st.get(s.charAt(i)) + 1);
            else
                st.put(s.charAt(i),1);
        }
        for(int i=0;i<t.length();i++){
            if(st1.keySet().contains(t.charAt(i)) == true)
                st1.put(t.charAt(i),st1.get(t.charAt(i)) + 1);
            else
                st1.put(t.charAt(i),1);
        }
        for(Map.Entry<Character,Integer> entry:st.entrySet()){
            if(st1.keySet().contains(entry.getKey()) == true){
                //System.out.println(st1.get(entry.getKey()) == entry.getValue());
                //System.out.println(st1.get(entry.getKey()).equals(entry.getValue()));
                //System.out,println(st1.get(entry.getKey()) + " " + entry.getValue());
                //System.out.println(st1.get(entry.getKey()).getClass().getName() + " " + entry.getValue().getClass().getName());
                if(st1.get(entry.getKey()) - entry.getValue() != 0){
                    res = false;
                }
            }
            else
                res = false;
        }
        return res;
    }
}