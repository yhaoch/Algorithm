public class Solution {
    public int romanToInt(String s) {
        if(s.length() == 0)
            return 0;
        Map<String,Integer> st = new HashMap<>();
        st.put("I", 1);
        st.put("IV",4);
        st.put("V",5);
        st.put("IX",9);
        st.put("X",10);
        st.put("XL",40);
        st.put("L",50);
        st.put("XC",90);
        st.put("C",100);
        st.put("CD",400);
        st.put("D",500);
        st.put("CM",900);
        st.put("M",1000);
        int sum = 0;
        int i = 0;
        while(i<s.length()){
            if(i<s.length()-1){
                String temp = s.substring(i,i+2);
                if(st.keySet().contains(temp) == true){
                    sum += st.get(temp);
                    i += 2;
                }
                else{
                    sum += st.get(s.substring(i,i+1));
                    i+=1;
                }
            }
            else if(i == s.length()-1){
                sum += st.get(s.substring(i,i+1));
                i+=1;
            }
        }
        return sum;
    }
}
