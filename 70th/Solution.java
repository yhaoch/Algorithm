public class Solution {
    public int climbStairs(int n) {
        if(n <= 2)
            return n;
        int temp = 0;
        int a = 1,b=2;
        for(int i = 3;i<=n;i++){
            temp = a + b;
            a = b;
            b = temp;
        }
        return temp;
    }
}
