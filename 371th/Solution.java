public class Solution {
    //
    public int getSum(int a, int b) {
        int carry = b;
        while(carry != 0){
            int temp = a;
            a = temp ^ carry;
            carry = (temp & carry) << 1;
        }
        return a;
    }
}
