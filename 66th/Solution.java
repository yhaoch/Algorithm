public class Solution {
    public int[] plusOne(int[] digits) {
        ArrayList<Integer> st = new ArrayList<>();
        int carry = 0;
        int len = digits.length;
        int lastnum = digits[len-1];
        carry = (1 + lastnum) / 10;
        st.add((1 + lastnum)%10);
        int temp =0;
        for(int j = len-2;j>=0;j--){
            temp = digits[j] + carry;
            carry = temp /10;
            st.add(temp%10);
        }
        if(carry > 0)
            st.add(carry);
        int [] res = new int [st.size()];
        int count = 0;
        for(int k = st.size()-1;k>=0;k--){
            res[count] = st.get(k);
            count ++;
        }
        return res;
    }
}
