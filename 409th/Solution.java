public class Solution {
    public int longestPalindrome(String s) {
        if(s.length() == 0)
            return 0;
        Map<Character,Integer> st = new LinkedHashMap<>();
        for(int i=0;i<s.length();i++){
            if(st.keySet().contains(s.charAt(i)) == true)
                st.put(s.charAt(i),st.get(s.charAt(i)) + 1);
            else
                st.put(s.charAt(i),1);
        }
        boolean pointer = false;
        int res= 0;
        for(Map.Entry<Character,Integer> entry:st.entrySet()){
            if(entry.getValue() % 2 == 0)
                res += entry.getValue();
            else{
                if(pointer == false){
                    res += entry.getValue();
                    pointer = true;
                }
                else{
                    res +=(entry.getValue()-1);
                }
            }
        }
        return res;
    }
}