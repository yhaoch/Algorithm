public class Solution {
    //using Memory Dymanic Program: TLE
    public int climbStairs(int n) {
        HashMap<Integer,Integer> st = new LinkedHashMap<>();
        int f = 0;
        if(st.keySet().contains(n) == true)
            return st.get(n);
        if(n <= 2)
            f = n;
        else
            f = climbStairs(n-1) + climbStairs(n-2);
        st.put(n,f);
        return f;
    }
}
