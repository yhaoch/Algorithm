public class Solution {
    public boolean judgeSquareSum(int c) {
        if(c < 0)
            return false;
        else{
            int left = 0; int right = (int)Math.sqrt(c);
            int res = 0;
            while(left<=right){
                res = left * left + right * right;
                if(res < c)
                    left ++;
                else if(res > c)
                    right--;
                else{
                    return true;
                }
            }
            return false;
        }
   }
}
