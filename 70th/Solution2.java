public class Solution {
    //using Memory Dymanic Program: OK but can not use hashmap to store the data it 
    // will lower the speed.
    public int climbStairs(int n) {
        int [] memo = new int[n+1];
        return compute(0,n,memo);
    }
    public int compute(int start, int n, int memo[]){
        //int f = 0;
        if(start > n)
            return 0;
        if(start == n)
            return 1;
        if(memo[start] > 0)
            return memo[start];
        memo[start] = compute(start + 1, n, memo) + compute(start + 2, n, memo);
        return memo[start];
    }
}
