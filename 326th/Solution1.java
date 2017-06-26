public class Solution {
    public boolean isPowerOfThree(int n) {
        // if((n & 3) == 1 || (n & 3) == 3)
        //     return true;
        // else
        //     return false;
        if(n == 1)
            return true;
        else{
            while(n!=0){
                if(n % 3 == 0){
                    n = n/3;
                    if(n == 1){
                        return true;
                    }
                }
                else
                    return false;
            }
        }
        return false;
    }
}