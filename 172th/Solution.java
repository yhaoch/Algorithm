public class Solution {
    //2 > 5
    //
    public int trailingZeroes(int n) {
        if(n <=4)
            return 0;
        int res = n;
        int count = 0;
        while(n>0){
            n /= 5;
            count += n;
        }
        return count;
    }
}
