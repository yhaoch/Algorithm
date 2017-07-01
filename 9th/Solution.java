public class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0)
            return false;
        else{
            int n = x;
            int res = n;
            int count = 0;
            int sum = 0;
            while(n != 0){
                n /= 10;
                count ++;
            }
            //System.out.println(count);
            while(res != 0){
                sum += (res % 10) * (int)Math.pow(10,count-1);
                count --;
                res /= 10;
            }
            if(sum == x)
                return true;
            return false;
        }
    }
}
