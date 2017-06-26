public class Solution {
    public String addStrings(String num1, String num2) {
        HashMap<Character,Integer> st = new HashMap<>();
        HashMap<Integer,Character> st1 = new HashMap<>();
        st.put('0',0);
        st.put('1',1);
        st.put('2',2);
        st.put('3',3);
        st.put('4',4);
        st.put('5',5);
        st.put('6',6);
        st.put('7',7);
        st.put('8',8);
        st.put('9',9);
        
        st1.put(0,'0');
        st1.put(1,'1');
        st1.put(2,'2');
        st1.put(3,'3');
        st1.put(4,'4');
        st1.put(5,'5');
        st1.put(6,'6');
        st1.put(7,'7');
        st1.put(8,'8');
        st1.put(9,'9');
        int add1 = 0;
        int add2 = 0;
        int len1 = num1.length()-1;
        int len2 = num2.length()-1;
        int max_len = Math.max( num1.length(), num2.length());
        int min_len = Math.min( num1.length(), num2.length());
        int sum =0;
        int carry = 0;
        int digit = 0;
        String res = "";
        while(true){
            sum = carry + st.get(num2.charAt(len2)) + st.get(num1.charAt(len1));
            carry = sum / 10;
            digit = sum % 10;
            res += st1.get(digit);
            len2 --;
            len1 --;
            min_len --;
            max_len --;
            if(min_len == 0)
                break;
        }
        while(max_len != 0){
            if(num1.length() > num2.length()){
                sum = carry + st.get(num1.charAt(len1));
                carry = sum / 10;
                digit = sum % 10;
                res += st1.get(digit);
                len1 --;
                max_len --;
            }
            else{
                sum = carry + st.get(num2.charAt(len2));
                carry = sum / 10;
                digit = sum % 10;
                res += st1.get(digit);
                len2 --;
                max_len --;
            }
        }
        if(carry > 0){
            res += st1.get(carry);
        }
        return new StringBuilder(res).reverse().toString();
    }
}
