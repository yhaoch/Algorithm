public class Solution {
    public String toHex(int num) {
        HashMap<Integer,Character> st = new HashMap<>();
        st.put(0,'0');
        st.put(1,'1');
        st.put(2,'2');
        st.put(3,'3');
        st.put(4,'4');
        st.put(5,'5');
        st.put(6,'6');
        st.put(7,'7');
        st.put(8,'8');
        st.put(9,'9');
        st.put(10,'a');
        st.put(11,'b');
        st.put(12,'c');
        st.put(13,'d');
        st.put(14,'e');
        st.put(15,'f');
        //char array initialize:
        //char [] arr = {'a','b','c','d','e','f'};
        String res = "";
        int temp = 0;
        if(num == 0)
            return "0";
        while(num != 0){
            res = st.get(num & 0xF) + res;
            num = num >>> 4;
        }
        return res;
    }
}
