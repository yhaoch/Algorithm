public class Solution {
    public String convertToBase7(int num) {
        int itera = Math.abs(num);
        if(Math.abs(num) < 7)
            return String.valueOf(num);
        String s = "";
        while(itera >= 7){
            s += String.valueOf(itera%7);
            itera /= 7;
        }
        s += String.valueOf(itera);
        if(num < 0)
            return "-" + new StringBuilder(s).reverse().toString();
        else
            return new StringBuilder(s).reverse().toString();
    }
}
