public class Solution {
    public boolean isPowerOfTwo(int n) {
        if((Math.log10(n)/Math.log10(2)) % 1 == 0)
            return true;
        return false;
    }
}