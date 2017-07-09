public class Solution {
    public int reverse(int x) {
        if(x == 0)
            return 0;
        else{
            long temp = 0;
            while(x != 0){
                temp = temp * 10 + x % 10;
                //System.out.println(temp + " " + Integer.MAX_VALUE);
                x /= 10;
                if(temp < 0 && temp < Integer.MIN_VALUE)
                    return 0;
                if(temp > 0 && temp > Integer.MAX_VALUE)
                    return 0;
            }
            return (int)temp;
        }
    }
}
