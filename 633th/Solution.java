public class Solution {
    public boolean judgeSquareSum(int c) {
        HashMap<Integer,Integer> st = new HashMap<>();
        int temp = (int)Math.sqrt(c);
        for(int i=0;i <= temp;i++)
            st.put(i*i,0);
        int t = 0;
        for(int j = 0;j<= temp;j++){
            t = c - j * j;
            if(st.keySet().contains(t) == true )
                return true;
        }
        return false;
   }
}
