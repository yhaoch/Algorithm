public class Solution {
    public int lengthOfLastWord(String s) {
        int len = s.length();
        if(len == 0){
            return 0;
        }
        boolean f = false;
        int idx = 0;
        ArrayList<String> st = new ArrayList<>();
        String temp = "";
        for(int i = 0;i<len;i++){
            if(s.charAt(i) != ' '){
                temp+=s.charAt(i);
            }
            else if(s.charAt(i) == ' '){
                    if(temp.equals("") != true){
                    st.add(temp);
                    temp = "";
                }
            }
        }
        if(temp.equals("") == false)
            return temp.length();
        else{
            if(st.size() == 0)
                return 0;
            return st.get(st.size()-1).length();
        }
    }
}
