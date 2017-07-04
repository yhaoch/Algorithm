public class Solution {
    public String addBinary(String a, String b) {
        if(a.length() == 0 && b.length() == 0)
            return "0";
        char carry = '0';
    	char [] addition;
        int len1 = a.length();
        int len2 = b.length();
        int maxlen = Math.max(a.length(),b.length());
        int minlen = Math.min(a.length(),b.length());
        String res = "";
        //System.out.println(len1 + " " + len2 + " " + minlen);
        while(maxlen > 0){
            if(minlen > 0){
                addition = add(a.charAt(len1-1),b.charAt(len2-1),carry);
                //System.out.println(addition[0] + " " + addition[1]);
                //System.out.println(minlen);
                minlen--;
                maxlen--;
                len1 --;
                len2 --;
                carry = addition[0];
                res += addition[1];
                //System.out.println(len1);
                continue;
            }
            //System.out.println(len1 + " " + len2 + " " + maxlen);
            if(len1 == 0){
                //b = b.substring(0,b.size()-a.size());
                //System.out.println(len2);
                addition = add('0',b.charAt(len2-1),carry);
                len2 --;
                maxlen--;
                carry = addition[0];
                res += addition[1];
            }
            else if(len2 == 0){
                addition = add(a.charAt(len1-1),'0',carry);
                len1 --;
                maxlen--;
                carry = addition[0];
                res += addition[1];
            }
            //System.out.println(res);
        }
        if(carry == '1'){
            res += carry;
        }
        //System.out.println(res);
        return new StringBuilder(res).reverse().toString();
    }
    public char[] add(char a,char b,char carry){
        char [] st = new char [2];
        //String ans = "";
        if(a == '1' && b == '1'){
            if(carry == '0'){
                st[0] = '1';
                st[1] = '0';
            }
            else if(carry == '1'){
                st[0] = '1';
                st[1] = '1';
            }
        }
        else if(a == '0' && b == '1'){
            if(carry == '0'){
                st[0] = '0';
                st[1] = '1';
            }
            else if(carry == '1'){
                st[0] = '1';
                st[1] = '0';
            }
        }
        else if(a == '1' && b == '0'){
            if(carry == '0'){
                st[0] = '0';
                st[1] = '1';
            }
            else if(carry == '1'){
                st[0] = '1';
                st[1] = '0';
            }
        }
        else if(a == '0' && b == '0'){
            if(carry == '0'){
                st[0] = '0';
                st[1] = '0';
            }
            else if(carry == '1'){
                st[0] = '0';
                st[1] = '1';
            }
        }
        return st;
    }
}
