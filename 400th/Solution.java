public class Solution {
    public int findNthDigit(int n) {
        //
        long start = 1, count=1,len = 9;
        while(n> count * len){
            n -= count * len;
            count ++;
            len *= 10;
            start *= 10;
        }
        start += (n-1) / count;
        long idx = (n-1) % count;
        String res = "" + start;
        return res.charAt((int)idx) - '0';
    }
}
