public class Solution {
    public List<String> readBinaryWatch(int num) {
        List<String> st = new ArrayList<String>();
        if(num == 0){
            st.add("0:00");
            return st;
        }
        for(int i = 0;i<12;i++)
            for(int j =0;j<60;j++){
                int count = 0;
                String temp = Integer.toString(i,2) + Integer.toString(j,2);
                //System.out.println(temp);
                for(int k = 0;k<temp.length();k++){
                    if(temp.charAt(k) == '1')
                        count ++;
                }
                if(count == num)
                    st.add(String.format("%d:%02d", i, j));
            }
        return st;
    }
}
