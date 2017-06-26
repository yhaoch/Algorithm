public class Solution {
    public boolean isHappy(int n) {
        HashMap<Integer,Integer> st = new HashMap<>();
        int temp = 0;
        while(true){
            while(n!=0){
                temp += (int)Math.pow(n % 10,2);
                n /= 10;
            }
            if(temp == 1)
                return true;
            else if(st.keySet().contains(temp) == true)
                return false;
            st.put(temp,1);
            n = temp;
            temp = 0;
        }
    }
}
