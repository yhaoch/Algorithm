public class Solution {
    public boolean isPowerOfFour(int num) {
        if((Math.log10(num)/Math.log10(4)) % 1 == 0)
            return true;
        else
            return false;
    }
}
