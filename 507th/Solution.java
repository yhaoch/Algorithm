public class Solution {
    public boolean checkPerfectNumber(int num) {
        int n = 2;
        int sum =1;
        if(num == 1)
            return false;
        while(n <= (int)Math.sqrt(num)){
            if(num % n == 0){
                sum += n;
                sum += num / n;
            }
           	n ++;
        }
        if(sum == num)
            return true;
       	else
            return false;
    }
}
