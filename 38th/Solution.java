public class Solution {
    public String countAndSay(int n) {
        ArrayList<String> st = new ArrayList<>();
        for(int i=1;i <=n;i++){
            int len = st.size();
            if(len == 0){
                st.add("1");
                continue;
            }
           	String temp = st.get(len-1);
            int len2 = temp.length();
            if(len2 == 1){
                st.add("11");
                continue;
            }
            char t = temp.charAt(0);
            int count = 0;
            String res = "";
            for(int j=0;j<len2;j++){
                if(temp.charAt(j) != t){
                 	res += "" + count;
                    res += t;
                    t = temp.charAt(j);
                    count = 0;
                }
                if(j == len2 -1){
                    count ++;
                    res += "" + count;
                    res += t;
                    count = 0;
                }
                count ++;
            }
            st.add(res);
        }
        return st.get(st.size()-1);
    }
}
