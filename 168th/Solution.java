public class Solution {
    public String convertToTitle(int n) {
        int count = 0;
        String s = "";
        while(n!=0){
            if(n % 26 == 0){
                s += 'Z';
                n -= 1;
            }
            else{
                s += (char)((n % 26)+64);
            }
            n = n/26;
        }
        //new StringBuffer(s).reverse().toString
        return new StringBuffer(s).reverse().toString();
    }
}
