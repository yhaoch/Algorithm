public class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Integer> st = new LinkedHashMap<>();
        HashMap<Character,Integer> st1 = new LinkedHashMap<>();
        if(s.length() != t.length())
            return false;
        for(int i = 0;i< s.length();i++){
            if(st.keySet().contains(s.charAt(i)) != true && st1.keySet().contains(t.charAt(i)) != true){
                st.put(s.charAt(i),i);
                st1.put(t.charAt(i),i);
            }
            //be careful with the third condition!!
            if(st.keySet().contains(s.charAt(i)) == true && st1.keySet().contains(t.charAt(i)) == true && st.get(s.charAt(i)) == st1.get(t.charAt(i))){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
